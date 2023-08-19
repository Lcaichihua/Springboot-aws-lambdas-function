package com.spring.aws.config;

import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class AwsLambdaConfig {

public Supplier<String> greeting(){
    return () -> {
        return "Hello Word" ;
    };
}
}
