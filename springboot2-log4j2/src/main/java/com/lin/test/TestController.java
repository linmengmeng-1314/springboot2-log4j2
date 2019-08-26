package com.lin.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("test")
	public String println() {
		LOGGER.info("INFO 级别的日志");
		return "success";
	}
}
