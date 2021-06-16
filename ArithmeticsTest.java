package FirstSetOfTddPractice;

import FirstSetOfTddPractice.Arithmetics.Arithmetics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTest {
    @Test
    void testThatFirstInputCanBeCollected() {

        //given
        Arithmetics arithmetics = new Arithmetics();

        //when
        arithmetics.setFirstNumber(2);

        //assert
        assertEquals(2, arithmetics.getFirstNumber());
    }

    @Test
    void testThatSecondInputCanBeCollected() {

        Arithmetics arithmetics = new Arithmetics();
        arithmetics.setSecondNumber(4);
        assertEquals(4, arithmetics.getSecondNumber());
    }

    @Test
    void testThatSumOfTwoNumbersCanBeCollected() {

        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 2;
        double secondNumber = 4;
        arithmetics.addTwoNumbers(firstNumber, secondNumber);
        assertEquals(6, arithmetics.getSumOfTwoNumbers());

    }

    @Test
    void testThatMultiplicationOfTwoNumbersCanBeCollected() {

        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 5;
        double secondNumber = 4;
        arithmetics.multiplyTwoNumbers(firstNumber, secondNumber);
        assertEquals(20, arithmetics.getMultiplicationOfTwoNumbers());
    }

    @Test
    void testThatDivisionOfTwoNumbersCanBeGotten() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 18;
        double secondNumber = 4;
        arithmetics.divideTwoNumbers(firstNumber, secondNumber);
        assertEquals(4.5, arithmetics.getDivisionOfTwoNumbers());
    }

    @Test
    void testSubtractionOfTwoNumbers() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 16;
        double secondNumber = 7;
        arithmetics.subtractTwoNumbers(firstNumber, secondNumber);
        assertEquals(9, arithmetics.getSubtractionOfTwoNumbers());
    }

    @Test
    void testAverageOfTwoNumbers() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 19;
        double secondNumber = 12;
        arithmetics.averageOfTwoNumbers(firstNumber, secondNumber);
        assertEquals(15.5, arithmetics.getAverageOfTwoNumbers());
    }

    @Test
    void testForMinimumOfTwoNumbersWhenFirstIsSmaller() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 4;
        double secondNumber = 6;
        arithmetics.setMinimum(firstNumber, secondNumber);
        assertEquals(4, arithmetics.getMinimum());
    }

    @Test
    void testForMinimumOfTwoNumbersWhenFSecondIsSmaller() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 9;
        double secondNumber = 6;
        arithmetics.setMinimum(firstNumber, secondNumber);
        assertEquals(6, arithmetics.getMinimum());
    }

    @Test
    void testForMinimumOfTwoNumberWhenBothAreEqual() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 5;
        double secondNumber = 5;
        arithmetics.setMinimum(firstNumber, secondNumber);
        assertEquals(5, arithmetics.getMinimum());
    }

    @Test
    void testforMaximumOfTwoNumbersWhenFirstNumberIsGreater() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 13;
        double secondNumber = 7;
        arithmetics.setMaximum(firstNumber, secondNumber);
        assertEquals(13, arithmetics.getMaximum());
    }

    @Test
    void testforMaximumOfTwoNumbersWhenSecondNumberIsGreater() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 16;
        double secondNumber = 27;
        arithmetics.setMaximum(firstNumber, secondNumber);
        assertEquals(27, arithmetics.getMaximum());
    }

    @Test
    void testforMaximumOfTwoNumbersWhenBothAreEqual() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 23;
        double secondNumber = 23;
        arithmetics.setMaximum(firstNumber, secondNumber);
        assertEquals(23, arithmetics.getMaximum());
    }

    @Test
    void testToFindTheSquareOfTheFirstNumber() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 7;
        arithmetics.setSquare(firstNumber);
        assertEquals(49, arithmetics.getSquare());
    }

    @Test
    void testToFindTheSquareOfTheSecondNumber() {
        Arithmetics arithmetics = new Arithmetics();
        double secondNumber = 6;
        arithmetics.setSquare(secondNumber);
        assertEquals(36, arithmetics.getSquare());
    }

    @Test
    void testToFindTheSquareOfANegativeNumber() {
        Arithmetics arithmetics = new Arithmetics();
        double number = -4;
        arithmetics.setSquare(number);
        assertEquals(16, arithmetics.getSquare());
    }

    @Test
    void testToFindTheSquareOfZero() {
        Arithmetics arithmetics = new Arithmetics();
        double number = 0;
        arithmetics.setSquare(number);
        assertEquals(0, arithmetics.getSquare());
    }

    @Test
    void testToFindTheCubeOfTheFirstNumber() {
        Arithmetics arithmetics = new Arithmetics();
        double firstNumber = 3.5;
        arithmetics.calculateCube(firstNumber);
        assertEquals(42.875, arithmetics.getCube());
    }

    @Test
    void testToFindTheCubeOfTheSecondNumber() {
        Arithmetics arithmetics = new Arithmetics();
        double secondNumber = 2;
        arithmetics.calculateCube(secondNumber);
        assertEquals(8, arithmetics.getCube());
    }

    @Test
    void testToFindTheCubeOfANegativeNumber() {
        Arithmetics arithmetics = new Arithmetics();
        double value = -4;
        arithmetics.calculateCube(value);
        assertEquals(-64, arithmetics.getCube());
    }

    @Test
    void testToFindTheCubeOfZero() {
        Arithmetics arithmetics = new Arithmetics();
        double value = 0;
        arithmetics.calculateCube(value);
        assertEquals(0, arithmetics.getCube());
    }

}