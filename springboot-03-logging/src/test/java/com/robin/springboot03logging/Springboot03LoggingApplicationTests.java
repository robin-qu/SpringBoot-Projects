package com.robin.springboot03logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03LoggingApplicationTests {

	@Test
	void contextLoads() {
		Logger LOGGER = LoggerFactory.getLogger(getClass());

		LOGGER.trace("This is trace log...");
		LOGGER.debug("This is debug log...");
		LOGGER.info("This is info log...");
		LOGGER.warn("This is warn log...");
		LOGGER.error("This is error log...");
	}

}
