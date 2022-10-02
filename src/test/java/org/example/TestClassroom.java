package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

class TestStudent {
    Student student;
    HashMap<Nationality, String> nationalities = new HashMap<>();

    @BeforeEach
    void setUp() {
        student = new Student();
        nationalities.put(Nationality.AZERBAIJANI, "Azerbaijani");
        nationalities.put(Nationality.BRITISH, "British");
        nationalities.put(Nationality.CHINESE, "Chinese");
        nationalities.put(Nationality.OTHER, "Other");
    }

    @Test
    void testGetDefaultFullName(){
        assertEquals("John Doe", student.getFullName());
    }

    @Test
    void testSetName(){
        student.setFirstName("Amy");
        assertEquals("Amy Doe", student.getFullName());

        student.setSecondName("Winehouse");
        assertEquals("Amy Winehouse", student.getFullName());
    }

    @Test
    void testSetAge(){
        student.setAge(23);
        assertEquals(23, student.getAge());
    }

    @Test
    void testNationality(){
        for (Nationality nat: nationalities.keySet()){
            student.setNationality(nat);
            assertEquals(nationalities.get(nat), student.getNationality());
        }
    }

    @Test
    void testSetGPA(){
        student.setGPA(90.4);
        assertEquals(90.4, student.getGPA());
    }   
}