package se.iths.JavaVerktygLabb1test1;


import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddNumbers(){
        System.out.println("Kör test testet");
        Calculator calculator = new Calculator();
        int result = calculator.addNumbers(5, 5);
        assertTrue(result == 10);
    }

    @RepeatedTest(20)
    void testSubtractNumbers(){
        System.out.println("Kör repeated test testet");
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtractNumbers(8,4));
    }

    @Disabled
    void testMultiplyNumbers(){
        System.out.println("Kör (inte?) disabled testet");
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiplyNumbers(2,5));
    }

    @DisplayName("Testar divisionsmetoden")
    void testDivideNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divideNumbers(60, 20));
    }






}
