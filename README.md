## College Certificate App
A JavaFX-based desktop application that allows interaction with a student SQL database and generates Transfer Certificates (TCs) and other documents. This application is built using JavaFX, Maven, and follows a modular project structure.

Requirements
Before you can run this application, make sure you have the following installed:

- Java 11+ (preferably JDK 23 or higher for JavaFX)
- Maven (to build and run the project)
- A working SQL database for managing student records

### Installation
1. Clone the repository
First, clone the repository to your local machine:

``` bash
git clone https://github.com/yourusername/college-certificate-app.git
cd college-certificate-app
```
2. Set up your Java environment
Ensure that JAVA_HOME is set to JDK 11+ or higher. For example, if you're using JDK 23:
``` bash
export JAVA_HOME=/path/to/jdk-23
export PATH=$JAVA_HOME/bin:$PATH
```
Then run:
``` bash
source ~/.bashrc
``` 
Or 
Go to Environment Variables and set JAVA_HOME to the directory of JDK 23 (e.g., C:\Program Files\Java\jdk-23).

3. Build the Project with Maven
Ensure Maven is installed on your system. If it’s not, download Maven and install it.

From the root of the project directory, run:

``` bash
mvn clean compile
```
This will compile the project and download the necessary dependencies.

4. Run the Application
To run the JavaFX application:

``` bash
mvn clean javafx:run
```
This will start the JavaFX application. You can interact with the student database and generate Transfer Certificates and other documents.


Connect with jdbc demo
https://www.javaguides.net/2019/07/javafx-jdbc-mysql-tutorial.html
