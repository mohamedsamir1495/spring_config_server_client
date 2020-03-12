package com.example.spring_config_server_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigRetrievalController {

    @Value("${database.connection}") String databaseConnection;

    @GetMapping("/databaseConnection")
    public String showLuckyWord() {
        return "Database Connection url: " + databaseConnection;
    }
}