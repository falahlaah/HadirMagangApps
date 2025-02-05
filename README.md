# HadirMagangApps

## Automation Web Testing Project
This project demonstrates web automation testing for HadirMagangApps using Java, Selenium, TestNG, Cucumber, and Extent Report. 
Follow the instructions below to set up and run your tests.

## Prerequisites
Ensure that you have the following installed:
Java Development Kit (JDK) 17
Apache Maven
IntelliJ IDEA

## Project Setup
### 1. Clone the repository:
```
git clone  https://github.com/falahlaah/HadirMagangApps.git
```
### 2. Navigate to the project directory:
```
cd HadirMagangApss
```

### 3. Open the project in IntelliJ IDEA:
```
Open IntelliJ IDEA.
Go to File -> Open.
Browse to the directory where the project is cloned and click OK.
```

### 4.Build the project using Maven:
```
Open the Terminal window in IntelliJ IDEA.
Run the following command:
mvn clean install
```


## Running Tests
### Using Cucumber Feature files
```
Each feature file contains scenarios written in Gherkin language. To run a specific feature file:

Locate the feature file in the Project pane.
Right-click on the feature file.
Select Run 'Feature: <feature-file-name>'.
```

## Generating Reports
```
The project uses ExtentReports for generating detailed reports.

After running the tests, the report will be generated in the /test-output directory.
Open the ExtentReport.html file in a browser to view the test execution report.
```

## Project Structure
```
src/main/java: Contains application code (if any).
src/test/java: Contains test classes and step definitions.
src/test/resources: Contains feature files and configuration files.
test-output: Contains the test results and reports.
```
## Customizing the Project
```
Updating Dependencies: Modify the pom.xml to add or update dependencies as needed.
Modifying Cucumber Options: Update CucumberRunner class with desired tags and features.
```
## Troubleshooting
```
If you encounter issues:
Ensure all dependencies are correctly added in the pom.xml.
Verify the correct Java version is being used.
Check if WebDriver binaries (e.g., ChromeDriver) are properly configured in system PATH.
```
