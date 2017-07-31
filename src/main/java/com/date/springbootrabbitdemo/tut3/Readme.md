# Publisher & Subscribe

## In this part we'll implement the fanout pattern to deliver a message to multiple consumers. This pattern is known as "publish/subscribe"


***Essentially, published messages are going to be broadcast to all the receivers.***

## Exchange

> The core idea in the messaging model in RabbitMQ is that the producer never sends any messages directly to a queue. Actually, quite often the producer doesn't even know if a message will be delivered to any queue at all.

  Instead, the producer can only send messages to an exchange. An exchange is a very simple thing. On one side it receives messages from producers and the other side it pushes them to queues. The exchange must know exactly what to do with a message it receives. Should it be appended to a particular queue? Should it be appended to many queues? Or should it get discarded. The rules for that are defined by the exchange type

## compile & run

```
mvn clean
```

And of course, to execute the tutorial do the following:

```
java -jar target/rabbit-tutorials-1.7.1.RELEASE.jar --spring.profiles.active=pub-sub,receiver
    --tutorial.client.duration=60000
java -jar target/rabbit-tutorials-1.7.1.RELEASE.jar --spring.profiles.active=pub-sub,sender
    --tutorial.client.duration=60000
Using rabbitmqctl list_bindings yo
```


## reference

http://www.rabbitmq.com/tutorials/tutorial-three-spring-amqp.html

