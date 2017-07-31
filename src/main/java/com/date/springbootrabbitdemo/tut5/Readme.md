# testing for `topic` mode


## build & run

To build the project:

`mvn clean package`

To execute the sender and receiver with the correct profiles execute the jar with the correct parameters:

```
java -jar target/rabbit-tutorials-1.7.1.RELEASE.jar
    --spring.profiles.active=topics,receiver
    --tutorial.client.duration=60000
java -jar target/rabbit-tutorials-1.7.1.RELEASE.jar
    --spring.profiles.active=topics,sender
    --tutorial.client.duration=60000
 ```

## reference

http://www.rabbitmq.com/tutorials/tutorial-five-spring-amqp.html