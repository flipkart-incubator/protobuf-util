package com.flipkart.protobuf.ext.client.http;

import cart.client.v2.datamodels.CartInfo;
import com.flipkart.protobuf.ext.server.GetRequest;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class CartClientImpl {

	private CloseableHttpClient closeableHttpClient;

	public CartClientImpl(String host, int port, int timeToLive, int maxTotal) {
		this.closeableHttpClient = getCloseableHttpClient(host, port, timeToLive, maxTotal);
	}

	public static CloseableHttpClient getCloseableHttpClient(String host, int port, int timeToLive, int maxTotal) {
		SSLContext context = SSLContexts.createSystemDefault();
		Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
				.register("http", PlainConnectionSocketFactory.INSTANCE)
				.register("https", new SSLConnectionSocketFactory(context, new BrowserCompatHostnameVerifier()))
				.build();
		PoolingHttpClientConnectionManager connectionManager;
		if (timeToLive > 0) {
			connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry, null, null, null, timeToLive, TimeUnit.SECONDS);
		} else {
			connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
		}

		connectionManager.setMaxTotal(maxTotal);
		connectionManager.setDefaultMaxPerRoute(maxTotal);
		HttpHost httpHost = new HttpHost(host, port);
		connectionManager.setMaxPerRoute(new HttpRoute(httpHost), maxTotal);
		return HttpClients.custom()
				.disableCookieManagement()
				.setConnectionManager(connectionManager)
				.disableContentCompression()
				.build();
	}

	private RequestConfig requestConfigBuilder(int connectionTimeout, int operationTimeout) {
		RequestConfig.Builder confBuilder = RequestConfig.custom()
				.setConnectTimeout(connectionTimeout)
				.setSocketTimeout(operationTimeout)
				.setConnectionRequestTimeout(connectionTimeout);
		return confBuilder.build();
	}

	public Object makeGetCart() throws IOException {
		GetRequest request = GetRequest.newBuilder().setId("id").build();
		String url = "http://localhost:9938/cart/get";
		HttpGet get = new HttpGet(url);
		get.addHeader("Content-Type", "application/json");
		get.setConfig(requestConfigBuilder(100, 1000));
		CloseableHttpResponse httpResponse = closeableHttpClient.execute(get);
		String response = httpResponse.getEntity() != null ? EntityUtils.toString(httpResponse.getEntity(), StandardCharsets.UTF_8) : null;
		return response;
	}

	public void shutdown() throws InterruptedException, IOException {
		closeableHttpClient.close();
	}

	public static void main(String[] args) throws IOException {
		CartClientImpl client = new CartClientImpl("localhost", 9938, 60, 200);
		Object cart = client.makeGetCart();
		System.out.println(cart);
	}
}
