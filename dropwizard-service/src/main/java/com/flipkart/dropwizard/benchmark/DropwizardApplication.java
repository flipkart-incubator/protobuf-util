package com.flipkart.dropwizard.benchmark;

import com.flipkart.dropwizard.benchmark.resources.CartResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.io.IOException;

public class DropwizardApplication extends Application<DropwizardConfiguration> {

	public static void main(final String[] args) throws Exception {
		new DropwizardApplication().run(args);
	}

	@Override
	public String getName() {
		return "Dropwizard";
	}

	@Override
	public void initialize(final Bootstrap<DropwizardConfiguration> bootstrap) {
		// TODO: application initialization
	}

	@Override
	public void run(final DropwizardConfiguration configuration,
					final Environment environment) {
		try {
			environment.jersey().register(new CartResource());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
