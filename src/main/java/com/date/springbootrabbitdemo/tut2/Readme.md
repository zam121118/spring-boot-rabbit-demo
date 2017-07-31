# for "Work Queues"


## like package `tut2`

how to run and test it

> Putting it all together

  Compile them using mvn package and run with the following options

```
mvn clean package

java -jar target/spring-boot-rabbit-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=work-queues,receiver
java -jar target/spring-boot-rabbit-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=work-queues,sender
```

## reference

http://www.rabbitmq.com/tutorials/tutorial-two-spring-amqp.html

http://www.rabbitmq.com/releases/rabbitmq-java-client/current-javadoc/