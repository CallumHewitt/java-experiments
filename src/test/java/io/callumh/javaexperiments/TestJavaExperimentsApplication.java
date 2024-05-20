package io.callumh.javaexperiments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestJavaExperimentsApplication {

	public static void main(String[] args) {
		SpringApplication.from(JavaExperimentsApplication::main).with(TestJavaExperimentsApplication.class).run(args);
	}

}
