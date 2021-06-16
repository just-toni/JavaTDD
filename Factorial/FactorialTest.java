package FirstSetOfTddPractice.Factorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @AfterEach
    void tearDown() {
        factorial = null;
    }

    @Test
    void testThatANumberCanBeCollected(){
        int input = 5;
        factorial.collectInput(input);
        assertEquals(5, factorial.getInput());
    }

    @Test
    void testThatANumberLessThanZeroCantBeCollected(){
        int input = -9;
        factorial.collectInput(input);
        assertEquals(0, factorial.getInput());
    }

    @Test
    void testToFindFactorialWhenInputIsZero(){
        int input = 0;
        factorial.calculateFactorial(input);
        assertEquals(1, factorial.getFactorial());
    }

    @Test
    void testToFindFactorialOfInputGreaterThanZero(){
        int input = 5;
        factorial.calculateFactorial(input);
        assertEquals(120, factorial.getFactorial());
    }

    @Test
    void testToFindFactorialOfInputWithMathematicalConstant(){
        int input = 2;
        factorial.calculateMathematicalConstantE(input);
        assertEquals(3, factorial.getMathConstantE());
    }

    @Test
    void testToFindFactorialOfInputWithEToPowerX(){
        int input = 3;
        factorial.calculateMathematicalConstantEToPowerX(input);
        assertEquals(37, factorial.getMathConstantEToPowerX());
    }
}