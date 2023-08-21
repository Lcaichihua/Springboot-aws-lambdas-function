package com.spring.aws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class AwsLambdaConfig {

    @Bean(name = "saludar")
    public Supplier<String> greeting() {
        return () -> "Hello Word";
    }

    @Bean
    public Consumer<String> printParam(){

        return (param) -> {
            System.out.println(param);
        };
    }
    @Bean
    public Function<String,String> receiveParam(){
        return (param) -> {
          String name =param.toUpperCase();
          return name;
        };
    }

    //generate a JSON
    @Bean
    public Supplier<Map<String ,Object>> createCharacter(){
        return ()-> {
            Map<String, Object > character =new HashMap<>();
            character.put("name","Goky");
            character.put("healthPoints",100);
            character.put("skill","Kame Hame Ha.");
            return character;

        };
    }
    //receive a JSON and return String
    @Bean
    public Function<Map<String ,Object>,String> receiveCharaceter(){
        return (param) -> {
            param.forEach((key,value)->System.out.println(key + " - " +value.toString()));
            return "Personaje recibido";
        };
    }
}
