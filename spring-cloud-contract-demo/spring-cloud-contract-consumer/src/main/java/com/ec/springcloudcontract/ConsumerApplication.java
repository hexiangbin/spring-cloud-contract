package com.ec.springcloudcontract;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * com.ec.springcloudcontract.ConsumerApplication
 *
 * @author HeXiangBin
 * @date 2019-09-10
 */
@SpringBootApplication
@Slf4j
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);

        log.info("consumer application is running");
    }
}
