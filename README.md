# Getting Started with this archetype

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

=================================================================================================
# ***Update settings below given your project configuration/names***
# Guide to run your program after you generate your project 

### First of all execute maven command to generate packages in your local repository (my-project-name folder)

    - mvn clean install
      or
    - mvn clean install -Pdev

    PS1: First command is the default one, used to generated ear, packaged with war file to run on application servers. 
    PS2: The second one generate a jar file inside my-project-name-services target folder.
    PS3: The third one generate a jar file inside my-project-name-services target folder already packaged 
    with application-dev.properties and logback.xml files for development purposes.

### To run on Eclipse with DEV profile

### Go to Run -> Run Configurations -> Java Application

    - Tab 'Main'
      Project: my-project-name-services
      Main class: com.demo.Application

    - Tab 'Arguments'
      Program arguments: --spring.profiles.active=dev --server.port=8086

      PS: 'server.port' you may change for the one you want, in case the example one is being used by another application.

### To run as a Standalone APP using DEVELOPMENT configuration (JAR will be in the my-project-name-services target folder, ignore EAR module)

### Execute the following command

      - java -jar myApplicationName.jar --spring.profiles.active=dev