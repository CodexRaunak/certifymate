## College Certificate App
A JavaFX-based desktop application that allows interaction with a student SQL database and generates Transfer Certificates (TCs) and other documents. This application is built using JavaFX, Maven, and follows a modular project structure.

Requirements
Before you can run this application, make sure you have the following installed:

- Java 17 LTS (Temurin) https://adoptium.net/
- Maven (to build and run the project)
- A working SQL database for managing student records

### Installation
1. Clone the repository
First, clone the repository to your local machine:

``` bash
git clone https://github.com/yourusername/certifymate.git
cd certifymate
```
2. Set up your Java environment
Ensure that JAVA_HOME is set to JDK 17.
``` bash
export JAVA_HOME=/path/to/jdk-17
export PATH=$JAVA_HOME/bin:$PATH
```
Then run:
``` bash
source ~/.bashrc
``` 
Or 
Go to Environment Variables and set JAVA_HOME to the directory of JDK 17 (e.g., C:\Program Files\Java\jdk-17).

. Create env.properties for Database Configuration
To specify the database credentials (like username and password) in your project, follow these steps:

3. Create the env.properties file:

In the `src/main/resources` directory of your project, create a new file named `env.properties`.

Add the Database Credentials:
Inside the env.properties file, define your database username and password as follows:


```bash
SPRING_DATASOURCE_USERNAME=your_database_username
SPRING_DATASOURCE_PASSWORD=your_database_password
```

4. Build the Project with Maven
Ensure Maven is installed on your system. If it’s not, download Maven and install it.

From the root of the project directory, run:

``` bash
mvn clean install
```
This will setup the environment for the project and download the necessary dependencies.

Some informative Links:
Connect with jdbc demo
https://www.javaguides.net/2019/07/javafx-jdbc-mysql-tutorial.html
Spring Boot
https://medium.com/code-with-farhan/spring-boot-database-connection-jdbc-vs-jpa-hibernate-edc9708966fc
