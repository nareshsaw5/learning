package com.example.rest.demo;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    static Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

    @Test
    void contextLoads() {
        Date date = new Date();
        logger.info("Date {}", date);

    }

}
