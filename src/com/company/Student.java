package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name;
    private String lastName;
    private String patronimic;
    private LocalDate birthday;
    private String gender;
    private LocalDate entranceYear;

    public Student(String name, String lastName, String patronimic, LocalDate birthday, String gender, LocalDate entranceYear) {
        this.name = name;
        this.lastName = lastName;
        this.patronimic = patronimic;
        this.birthday = birthday;
        this.gender = gender;
        this.entranceYear = entranceYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getEntranceYear() {
        return entranceYear;
    }

    public void setEntranceYear(LocalDate entranceYear) {
        this.entranceYear = entranceYear;
    }
    public boolean isAdult(){
        long years = ChronoUnit.YEARS.between(birthday, LocalDate.now());
        boolean result = false;
        if (years >= 18){

            result = true;
        }else {
            result = false;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronimic='" + patronimic + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", entranceYear=" + entranceYear +
                '}';
    }
}
