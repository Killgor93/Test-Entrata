import java.io.FileWriter;
import java.io.IOException;

public class ReadmeGenerator {
public static void main(String[] args) {
String content = "# Selenium Automation Project\n\n"
+ "## Overview\n"
+ "This project automates browser interactions for testing the website [Entrata](https://www.entrata.com/). "
+ "The tests are written using the **Selenium WebDriver**, **BDD with Cucumber**, and **TestNG** for assertions.\n\n"
+ "## Prerequisites\n"
+ "- Java Development Kit (JDK 8 or later)\n"
+ "- Maven (or Gradle)\n"
+ "- Selenium WebDriver\n"
+ "- TestNG\n"
+ "- Cucumber\n\n"
+ "## Setup\n"
+ "1. Clone the repository:\n"
+ "    ```bash\n"
+ "    git clone https://github.com/username/selenium-project.git\n"
+ "    ```\n\n"
+ "2. Install dependencies:\n"
+ "    ```bash\n"
+ "    mvn clean install\n"
+ "    ```\n\n"
+ "## Running Tests\n"
+ "1. To run all the tests, execute:\n"
+ "    ```bash\n"
+ "    mvn test\n"
+ "    ```\n\n"
+ "## Folder Structure\n"
+ "- `src/main/java`: Application code\n"
+ "- `src/test/java`: Test code\n"
  + "- `src/test/resources`: Feature files\n";

    try (FileWriter writer = new FileWriter("Readme.md")) {
              writer.write(content);
              System.out.println("Readme.md created successfully.");
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
  }
