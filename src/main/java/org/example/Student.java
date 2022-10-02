package org.example;

enum Gender{
    MALE,
    FEMALE
}

enum Nationality{
    AZERBAIJANI,
    BRITISH,
    CHINESE,
    OTHER
}

public class Student {
    String firstName = "John";
    String secondName = "Doe";
    int age = 20;
    double gpa = 95.5;
    Gender gender = Gender.MALE;
    Nationality nationality = Nationality.OTHER;

    public String getFullName() {
        return this.firstName + " " + this.secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return this.gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public Gender setGender(Gender gender) {
        this.gender = gender;
        return this.gender;
    }

    public String getNationality() {
        String nat = "Unknown";
        switch (this.nationality) {
            case AZERBAIJANI:
                nat = "Azerbaijani";
                break;
            case BRITISH:
                nat = "British";
                break;
            case CHINESE:
                nat = "Chinese";
                break;
            default:
                nat = "Other";
                break;
        }
        return nat;

    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }
}