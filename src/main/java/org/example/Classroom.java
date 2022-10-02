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

public class Classroom {
    String firstName = "John";
    String secondName = "Doe";
    int age = 20;
    double gpa = 95.5;
    Gender gender = Gender.MALE;
    Nationality nationality = AZERBAIJANI;

    public String getStudentFullName() {
        return firstName + " " + secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        String nat = "Unknown"
        switch (this.nationality) {
            case AZERBAIJANI:
                nat = "Azerbaijani"
                break;
            case BRITISH:
                nat = "British"
                break;
            case OTHER:
                nat = "Other"
                break;
        
            default:
                break;
        }
        return nat;

    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}