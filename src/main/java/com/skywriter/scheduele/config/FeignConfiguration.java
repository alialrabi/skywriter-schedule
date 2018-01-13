package com.skywriter.scheduele.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.skywriter.scheduele")
public class FeignConfiguration {

}
