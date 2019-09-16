package com.ec.springcloudcontract;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ProviderApplication
 *
 * @author HeXiangBin
 * @date 2019-09-10
 */
@SpringBootApplication
@Slf4j
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class);

        log.info("provider application is running");
    }
}
