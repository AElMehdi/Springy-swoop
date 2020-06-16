package com.aelmehdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// These annotations are part of the Spring Context dependency:x
@Configuration
@PropertySource("classpath:myProp.properties")
public class PropertiesConfigurer {

    @Value("${first.prop}")
    private String myFirstProp;

    @Value("${second.prop}")
    private String mySecondProp;


    //To resolve ${} in @Value
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}
