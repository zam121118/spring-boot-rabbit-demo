package com.date.springbootrabbitdemo.tut1;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;


/**
 * Created by amin.zam on 2017/7/31.
 */


public class Tut1Sender {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send() {
        String message = "Hello World!";
        this.template.convertAndSend(queue.getName(), message);
        System.out.println(" [x] Sent '" + message + "'");
    }
}

/*
* You'll notice that spring-amqp removes the boiler plate code leaving you with
* only the logic of the messaging to be concerned about.
*　We autowire in the queue that was configured in our bean definition in the Tut1Config class
* and like many spring connection abstractions, we wrap the boilerplate rabbitmq client classes
* with a RabbitTemplate that can be autowired into the sender.
* All that is left is to create a message and invoke the template's convertAndSend method
* passing in the queue name from the bean we defined and the message we just created.
* */