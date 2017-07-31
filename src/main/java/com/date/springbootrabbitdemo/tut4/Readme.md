# use `routingKey` accomplement Routing

## compile & run

Compile as usual (see tutorial one for maven compilation and executing the options from the jar.

```
mvn clean package
```

In one terminal window you can run:

```
java -jar target/rabbit-tutorials-1.7.1.RELEASE.jar
    --spring.profiles.active=routing,receiver
    --tutorial.client.duration=60000
```

and in the other temrinal window run the sender


```
java -jar target/rabbit-tutorials-1.7.1.RELEASE.jar
    --spring.profiles.active=routing,sender
    --tutorial.client.duration=60000
```

## reference

http://www.rabbitmq.com/tutorials/tutorial-four-spring-amqp.html
