package com.flipkart.dropwizard.benchmark.resources;

import cart.client.v2.datamodels.CartInfo;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

@Path("/cart")
@Produces(MediaType.APPLICATION_JSON)
public class CartResource {
	private byte[] content;
	private  ObjectMapper objectMapper;

	public CartResource() throws IOException {
		File file = new File("src/main/resources/cart_response.json");
		content = Files.readAllBytes(file.toPath());
		this.objectMapper = getObjectMapper();
	}

	@Path("/get")
	@GET
	public CartInfo getCart() throws IOException {
		return objectMapper.readValue(content, CartInfo.class);
	}

	private ObjectMapper getObjectMapper(){
		ObjectMapper objectMapperInstance = new ObjectMapper();
		objectMapperInstance.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		objectMapperInstance.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapperInstance.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		objectMapperInstance.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
		objectMapperInstance.registerModule(new JodaModule());
		objectMapperInstance.registerModule(new GuavaModule());
		objectMapperInstance.setSubtypeResolver(new StdSubtypeResolver());
		objectMapperInstance.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		objectMapperInstance.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		return objectMapperInstance;
	}
}
