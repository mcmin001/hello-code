package com.hello.springboot.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hello.springboot")
@EntityScan("com.hello.springboot.model")
@Slf4j
public class WebAppServer {
}
