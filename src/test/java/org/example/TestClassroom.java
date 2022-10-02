package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.turgut.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

class TestClassroom {
    Classroom classroom;
    HashMap<PermissionLevel, String> nationalities = new HashMap<>();

    @BeforeEach
    void setUp() {
        classroom = new Classroom();
        nationalities.put(Nationality.AZERBAIJANI, "Azerbaijani");
        nationalities.put(Nationality.BRITISH, "British");
        nationalities.put(Nationality.CHINESE, "Chinese");
        nationalities.put(Nationality.OTHER, "Other");
    }

    @Test
    void testGetDefaultFullName(){
        assertEquals("John Doe", classroom.getStudentFullName());
    }

    @Test
    void testSetName(){
        classroom.setFirstName("Amy");
        assertEquals("Amy Doe", classroom.getStudentFullName());

        classroom.setSecondName("Winehouse");
        assertEquals("Amy Winehouse", classroom.getStudentFullName());
    }

    @Test
    void testSetAge(){
        classroom.setAge(23);
        assertEquals(23, classroom.getAge());
    }

    @Test
    void testNationality(){
        for (Nationality nat: nationalities.keySet()){
            classroom.setNationality(nat);
            assertEquals(nationalities.get(nat), classroom.getNationality());
        }
    }

    @Test
    void testSetGPA(){
        classroom.setGPA(90.4);
        assertEquals(90.4, classroom.getGPA());
    }   
}