package com.date.springbootrabbitdemo.tut1;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by amin.zam on 2017/7/31.
 */



// Indicates that a component is eligible for registration when one or more specified profiles are active.
@Profile({"tut1","hello-world"})
// Indicates that a class declares one or more @Bean methods and may be processed by the Spring container
// to generate bean definitions and service requests for those beans at runtime
@Configuration
public class Tut1Config {

    // Indicates that a method produces a bean to be managed by the Spring container.
    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public Tut1Receiver receiver() {
        return new Tut1Receiver();
    }

    @Profile("sender")
    @Bean
    public Tut1Sender sender() {
        return new Tut1Sender();
    }
}