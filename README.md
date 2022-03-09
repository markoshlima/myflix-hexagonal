# **Introduction**

Myflix is a simple project about testing hexagonal architecture.
The project is about a online movie store. We can see the movies have characters, and a character is played by an actor. It also has customers, who in turn they can watch movies.
It is a very quite simple entity relationship model.

![alt text](https://github.com/markoshlima/myflix-hexagonal/blob/main/doc/Entity%20Relatioship%20Model/Entity%20Relatioship%20Model.png?raw=true)

# **Hexagonal Architecture**

That is the ilustration about hexagonal in the literature from Tom Hombergs in his article about hexagonal architecture, showing how adapters and ports integrate and isolate the business layer. He says:

*"The main feature of “Hexagonal Architecture”, as opposed to the common layered architecture style, is that the dependencies between our components point “inward”, towards our domain objects.
The hexagon is just a fancy way to describe the core of the application that is made up of domain objects, use cases that operate on them, and input and output ports that provide an interface to the outside world."*

[Hexagonal Architecture with Java and Spring](https://reflectoring.io/spring-hexagonal/)

![alt text](https://github.com/markoshlima/myflix-hexagonal/blob/main/doc/Product%20Hexagonal%20Architecture/hexagonal-architecture.png?raw=true)

# **Myflix Hexagonal**

![](https://github.com/markoshlima/myflix-hexagonal/blob/main/doc/Product%20Hexagonal%20Architecture/Product%20Hexagonal%20Architecture.png?raw=true)

In this project the business layer represents the Use Case (Service) and Domain modules, and adapters, application outside from business layer, that is, this components don't know nothing about business rules, just the ports in and out (interfaces).
The input adapter injects the port in, and output adapter implements the port out. Actually this project there are the followings adapters implemented:

![](https://github.com/markoshlima/myflix-hexagonal/blob/main/doc/Product%20Hexagonal%20Architecture/Adapters%20Hexagonal.png?raw=true)

In the project we can see five adapters
- adapter-rest: is the input adapter, here we have the rest application and the contracts to access the business layer
- adapter-grpc: is another input adapter with grpc protocol
- adapter-repository: this is the output adapter, that write and read data from java list.
- adapter-cassandra: output adapter, that uses a phisical database Cassandra in AWS (Keyspace) to save and read data.
- adapter-dynamodb: other output for AWS Dynamodb databases to save and read.

The main point observed is: we can easily add new adapter in the project, it could be in or out, without know the business rules, just implementing the ports interfaces.
In this scenario we can supose in this project it is used Cassandra, but for any reason, it was nedeed to change to Dynamodb, so other good point observed, it is quite simple to migrate the database technology, just implement an output adapter from interfaces.

# Addition Information & Setup

To setup the environment:
- Pre Requisites:
    - Maven: 3.8.4
- To run locally without any integration, just use the adapter-repository and comment the adapters cassandra and dynamo inside main pom.xml and pom.xml's usecase folder.
- To run Cassandra (AWS Keyspace), generate the truststore and AWS credentials for Cassandra following the link: https://docs.aws.amazon.com/keyspaces/latest/devguide/dsbulk-upload-prequs.html
    - Replace your new truststore in `/myflix/adapter-cassandra/src/main/resources/cassandra_truststore.jks`
    - 	Change the credentials and password's keystore in `/myflix/adapter-cassandra/src/main/resources/cassandra.conf`
- To run Dynamodb adapter, just generate a credential with permission to access AWS Dynamodb and add the information inside the file: `/myflix/adapter-dynamodb/src/main/resources/application.properties`