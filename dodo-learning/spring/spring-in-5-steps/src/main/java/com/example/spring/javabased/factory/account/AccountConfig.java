package com.example.spring.javabased.factory.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfig {

    @Bean
    public AccountService accountService() {
        return new AccountService();
    }

    @Bean
    public AccountRepository accountRepository() {
        return new AccountRepository();
    }

}
