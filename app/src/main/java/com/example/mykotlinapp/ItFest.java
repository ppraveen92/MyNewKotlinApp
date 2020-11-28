package com.example.mykotlinapp;

public class ItFest {

    public boolean isQualified(String name, int percentage) {
        if (percentage > 60) {
            new ScholarshipAccount().creditScholar(name, 10000);
            return true;
        } else {
            new ScholarshipAccount().creditScholar(name);
            return false;
        }
    }
}
