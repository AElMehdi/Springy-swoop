package com.aelmehdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

// This is part of the spring test module
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = PropertiesConfigurer.class)
class PropertiesConfigurerTest {

    @Autowired
    private PropertiesConfigurer propertiesConfigurer;

    @Test
    void should_read_values_from_prop_file() {
        assertThat(propertiesConfigurer).isNotNull();

        assertThat(propertiesConfigurer.getFirstProp()).isEqualTo("first value");
        assertThat(propertiesConfigurer.getSecondProp()).isEqualTo("second value");
    }
}