package com.example.smpoject.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SmplojectTest {

    @Test
    void testEquals() {
        Smploject smploject = new Smploject(1L,"test","testa");
        Smploject smploject1 = new Smploject(2L,"test","testa");


        smploject1.getName().equals(smploject.getName());

    }

    @Test
    void canEqual() {
        Smploject smploject = new Smploject(1L,"test","testa");
        Smploject smploject1 = new Smploject(2L,"test","testa");
        Assertions.assertEquals(true,smploject1.getName().equals(smploject.getName()));

    }

    @Test
    void testHashCode() {
        Smploject smploject = new Smploject(1L,"test","testa");
        Smploject smploject1 = new Smploject(2L,"test","testa");
        smploject1.hashCode();
    }

    @Test
    void getId() {
        Smploject smploject = new Smploject(1L,"test","testa");

        smploject.getId();



    }

    @Test
    void getName() {
        Smploject smploject = new Smploject(1L,"test","testa");

        smploject.getName();
    }

    @Test
    void getText() {
        Smploject smploject = new Smploject(1L,"test","testa");

        smploject.getText();
    }

    @Test
    void builder() {
        Smploject smploject = Smploject.builder().build();
    }

    @Test
    void testEquals1() {


    }

    @Test
    void testHashCode1() {
    }
}