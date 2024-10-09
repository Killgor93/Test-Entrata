**Selenium BDD Cucumber Framework with TestNG**


**Overview**


This project automates the testing of the Entrata platform (https://www.entrata.com/c) using Selenium for browser automation, Cucumber for Behavior Driven Development (BDD), and TestNG for test execution and reporting. The framework is designed to validate the functionality and performance of various user interfaces and processes on the Entrata platform by executing feature scenarios written in Gherkin syntax. Additionally, assertions are used within the test cases to verify that expected outcomes match actual results during test execution. 

      The automation covers tasks such as:
         1. User is the Can't schedule demo with out filleing all the Details
         2. User Fails to log in as Property Manager due to invalid Credentials
         3. User is the Can't watch demo with out filleing all the Details

**Key Features:**
      Selenium: Automates browser interaction.
      Cucumber: BDD framework to write test cases in Gherkin.
      TestNG: For managing and running test cases.
      Maven: For dependency management and running tests.

**Project Structure**

├── src
│   ├── main
│   │   └── java
│   │       ├── Angular_Form
│   │           └── Pages
│   │           └── Utils                       # Utility classes for the project
                                      
**Utility classes for the project**
│   └── test
│       ├── java
│       │   ├── Angular_Form
│       │       └── Driverfactory             # Webdriver Class
│       │       └── Hooks
│       │       └── Runner                     # Test Runner classes
│       │       └── stepdefination             # Step definition classes
│       ├── resources
│       │   ├── Angular_Form
│       │       └── features                   # Feature files for BDD scenarios        
│       │       └── config.properties          # Configuration properties (browser, URLs, etc.)
└── pom.xml                                    # Maven dependencies and build configurations
└── Testng.xml                                 # Testng XML file 

**Folder/Files Breakdown:**

    1. Feature Files (.feature): Located in src/test/resources/features, these files contain test scenarios written in Gherkin.
    
    2. Step Definitions: Java classes that implement the test steps defined in the feature files.
    
    3. Test Runner: TestNG runner classes that trigger Cucumber tests.
    
    4. Utilities: Common utilities for the framework such as WebDriver setup and property file readers.
    
    5. config.properties: Configuration file to manage environment-specific settings like browser, base URL, etc.
    
**Prerequisites**

    Ensure the following tools are installed:
    1. Java: JDK version 11 or higher.
    
       Verify installation:
       
        java -version
    2. Maven: Maven version 3.6 or higher.
    
       Verify installation:
       
        mvn -version
        
    3. IDE: IntelliJ IDEA for coding and running tests.

**Installation and Setup**

    Clone the Repository
    
      Clone the project from GitHub (or other VCS):
      
      git clone https://github.com/yourusername/yourrepository.git
      
      cd your repository
      
**Set Up Maven Dependencies**

    Run the following command to download all necessary dependencies and compile the project:
    
        mvn clean install
        
       **Ensure that the following dependencies are listed in pom.xml**:
        *(COPY THIS FILE AND PASTE IT IN POM.XML FILE)*

<?xml version="1.0" encoding="UTF-8"?>

<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://maven.apache.org/POM/4.0.0"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>Entrata_project</groupId>
    <artifactId>Entrata_project</artifactId>
    <version>0.0.1-SNAPSHOT</version>

    <name>Entrata_project</name>
    <url>http://www.example.com</url>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.10.1</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.10.1</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-core -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-core</artifactId>
            <version>7.10.1</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.5.3</version>
        </dependency>


        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.12.0</version>
        </dependency>

        <dependency>
            <groupId>net.masterthought</groupId>
            <artifactId>maven-cucumber-reporting</artifactId>
            <version>5.7.4</version>
        </dependency>
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>klov-reporter</artifactId>
            <version>5.1.0</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>7.20.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.relevantcodes/extentreports -->
        <dependency>
            <groupId>com.relevantcodes</groupId>
            <artifactId>extentreports</artifactId>
            <version>2.41.2</version>
        </dependency>


        <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>5.1.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/log4j/log4j -->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>7.8.1</version>
        </dependency>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.4.0</version>
        </dependency>
    </dependencies>


    <build>
        <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
            <plugins>
                <!-- clean lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
                <plugin>
                    <artifactId>maven-clean-plugin</artifactId>
                    <version>3.1.0</version>
                </plugin>
                <!-- default lifecycle, jar packaging: see https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
                <plugin>
                    <artifactId>maven-resources-plugin</artifactId>
                    <version>3.0.2</version>
                </plugin>
                <plugin>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.8.0</version>
                </plugin>
                <plugin>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>2.22.1</version>
                </plugin>
                <plugin>
                    <artifactId>maven-jar-plugin</artifactId>
                    <version>3.0.2</version>
                </plugin>
                <plugin>
                    <artifactId>maven-install-plugin</artifactId>
                    <version>2.5.2</version>
                </plugin>
                <plugin>
                    <artifactId>maven-deploy-plugin</artifactId>
                    <version>2.8.2</version>
                </plugin>
                <!-- site lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle -->
                <plugin>
                    <artifactId>maven-site-plugin</artifactId>
                    <version>3.7.1</version>
                </plugin>
                <plugin>
                    <artifactId>maven-project-info-reports-plugin</artifactId>
                    <version>3.0.0</version>
                </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.11.0</version> <!-- Use the latest version available -->
                    <configuration>
                        <source>1.8</source> <!-- Specify the Java version -->
                        <target>1.8</target> <!-- Ensure the target is the same version -->
                    </configuration>
                </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>3.0.0-M5</version>
                    <configuration>
                        <suiteXmlFiles>
                            <suiteXmlFile>C:\Users\walkingtree\Test_Entrata\testng.xml</suiteXmlFile> <!-- Path to your TestNG XML file -->
                        </suiteXmlFiles>
                    </configuration>
                </plugin>

            </plugins>

        </pluginManagement>

    </build>
</project>

**Configuration File (config.properties)**

    Ensure the config.properties file in src/test/resources is set up correctly:

      browser=chrome                          # Defines the browser to use (e.g., chrome, firefox).
      
      baseUrl=https://www.entrata.com/c       # baseUrl: The base URL of Entrata.

**Running Tests**

1. Run Tests with Maven
   
    To run all tests, execute the following command:
   
    mvn clean test
   
    This command will:
   
       Clean the previous build.
   
       Compile and run all tests.

3. Run Tests with TestNG Suite
   
       To run tests using the TestNG.xml file:

**Generating Reports**

After test execution, Cucumber generates reports in various formats (e.g., JSON, HTML). You can find these reports in the target directory. To view them:

    1. Navigate to target/cucumber-report.html.
    
    2. Open the file in a browser.
    
**Example Report Plugins**

To generate reports in different formats, use the following configuration in the @CucumberOptions annotation:

     plugin = {"pretty", "html:target/CucumberReports/CucumberReport.html"})
