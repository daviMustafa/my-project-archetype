# Getting Started

#### PS: Any other idea for improvements, feel free to do a pull request or open an issue.

### This is a Maven Project to Generate a Maven Project Archetype
The following project allows you to create a maven archetype to 
generate a full modular project using Spring Boot.

PS: With simple code samples.

## Instructions:
1 - Execute inside root folder:

    mvn archetype:create-from-project

2 - Go to path_to_root_project/target/generated-sources/archetype

3 - Execute to install your archetype in your local repository:

    mvn install

4 - Inside your **.m2/repository** folder open **'archetype-catalog.xml'** file and check for installed archetypes

5 - Generate a new project with the following command:

    mvn archetype:generate -DarchetypeCatalog=local
    
6 - Follow the promtd commands.    

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-email)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Spring Boot Admin (Client)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#howto-execute-liquibase-database-migrations-on-startup)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#production-ready)
* [Spring Web Starter](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot Admin (Server)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

