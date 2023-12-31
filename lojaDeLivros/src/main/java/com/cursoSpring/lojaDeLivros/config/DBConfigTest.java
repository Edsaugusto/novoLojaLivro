package com.cursoSpring.lojaDeLivros.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cursoSpring.lojaDeLivros.services.DBServices;

@Configuration
// @Profile("test")
public class DBConfigTest {

    @Autowired
    private DBServices dbService;

    @Bean
    public void instanciaBancoDeDados() {
        this.dbService.instanciaBancoDeDados();
    }

}
