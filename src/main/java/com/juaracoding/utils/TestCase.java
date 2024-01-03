package com.juaracoding.utils;

public enum TestCase {

    T1("Admin Login Valid"),
    T2("Admin Login Invalid with Wrong Username"),
    T3("Admin Add Data Candidate");

    private String testCaseName;

    TestCase(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
