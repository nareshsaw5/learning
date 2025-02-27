package com.example.springdb;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringdbApplicationTests {

    static Logger logger = LoggerFactory.getLogger(SpringdbApplicationTests.class);

    @Test
    void contextLoads() {
    }

    @Test
    public void vargTest() {
        print("Naresh");
    }

    private void print(String... args) {
        logger.info(" {} ", args);
    }

}
