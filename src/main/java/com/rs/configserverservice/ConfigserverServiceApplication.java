package com.cbt.reservationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigserverServiceApplication
{
    public static void main(String[] args)
    {
            SpringApplication.run(com.cbt.reservationservice.ConfigserverServiceApplication.class);
    }
}
