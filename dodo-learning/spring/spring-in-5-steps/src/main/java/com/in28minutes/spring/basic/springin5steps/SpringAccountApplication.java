package com.in28minutes.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.spring.javabased.factory.account.AccountRepository;
import com.example.spring.javabased.factory.account.AccountService;

@ComponentScan(value = "com.example.spring.javabased.factory.account")
public class SpringAccountApplication {

    static Logger LOG = LoggerFactory.getLogger(SpringAccountApplication.class);

    public static void main(String[] arg) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAccountApplication.class);
        AccountService accountService = context.getBean(AccountService.class);
        AccountRepository accountRepository = context.getBean(AccountRepository.class);
        LOG.info("{} ", accountService);
        LOG.info("{} ", accountRepository);

    }

}
