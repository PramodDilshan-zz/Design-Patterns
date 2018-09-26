package com.filtter;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class Person {
    private String name;
    private String gender;
    private String marrageStatus;

    public Person(String name, String gender, String marrageStatus) {
        this.name = name;
        this.gender = gender;
        this.marrageStatus = marrageStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMarrageStatus() {
        return marrageStatus;
    }
}
