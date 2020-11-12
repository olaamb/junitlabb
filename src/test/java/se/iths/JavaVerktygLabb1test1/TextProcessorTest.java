package se.iths.JavaVerktygLabb1test1;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class TextProcessorTest {


    @BeforeAll
    static void startAlltests(){
        System.out.println("Startar testning...");
    }
    @BeforeEach
    void startOfTest(){
        System.out.println("Ett test startar nu!");
    }

    @Test
    public void testToUpperCase(){
        TextProcessor textProcessor = new TextProcessor();
        Assertions.assertNotEquals("stort", textProcessor.toUpperCase("stort"));
    }
    @Test
    public void testToLowerCase(){
        TextProcessor textProcessor = new TextProcessor();
        Assertions.assertNotNull(textProcessor.toLowerCase("HEJSAN"));
    }
    @AfterEach
    void endOfTest(){
        System.out.println("Testet avslutas nu!");
    }

    @AfterAll
    static void endAllTests(){
        System.out.println("Alla tester har avslutits...");
    }



}