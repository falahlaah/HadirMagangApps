package com.myCompany.utils;

public enum ScenarioTests {

    // T1 - T14
    // feature login logout
    T1("Successful login with valid email and password"),
    T2("Login fails with unregistered email"),
    T3("Login fails with email missing the '@' symbol"),
    T4("Login fails with email containing double '@' symbols"),
    T5("Login fails with email missing domain extensions"),
    T6("Login fails with an email that is not activated"),
    T7("Login fails without entering email and password"),
    T8("Login fails with empty email"),
    T9("Login fails with empty password"),
    T10("Login fails with invalid password"),
    T11("Verify password masking while entering the password"),
    T12("Verify disabling password masking"),
    T13("Login fails when internet is offline"),
    T14("Verify successful logout");

    // T14 - T1000000
    // feature ......

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }

}
