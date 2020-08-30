package com.robin.springboot03logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03LoggingApplicationTests {
	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	void contextLoads() {
		logger.trace("This is trace log...");
		logger.debug("This is debug log...");
		logger.info("This is info log...");
		logger.warn("This is warning log...");
		logger.error("This is error log...");
	}
}
