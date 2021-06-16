package FirstSetOfTddPractice.Cryptography;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {
    Cryptography cryptography;

    @BeforeEach
    void setUp() {
        cryptography = new Cryptography();
    }

    @AfterEach
    void tearDown() {
        cryptography = null;
    }

    @Test
    void testThatAFourDigitNumberCanBeCollected(){
        int input = 3456;
        cryptography.collectInput(input);
        assertEquals(3456, cryptography.getInput());
    }

    @Test
    void testThatANumberLessThanFourDigitCantBeCollected(){
        int input = 123;
        cryptography.collectInput(input);
        assertEquals(0, cryptography.getInput());
    }

    @Test
    void testThatANumberMoreThanFourDigitCantBeCollected(){
        int input = 67890;
        cryptography.collectInput(input);
        assertEquals(0, cryptography.getInput());
    }

    @Test
    void testThatFourthDigitCanBeRetrievedFromInput(){
        int input = 2345;
        cryptography.separateFourthDigit(input);
        assertEquals(5, cryptography.getFourthDigit());
    }

    @Test
    void testThatThirdDigitCanBeRetrievedFromInput(){
        int input = 6574;
        cryptography.separateThirdDigit(input);
        assertEquals(7, cryptography.getThirdInput());
    }

    @Test
    void testThatSecondDigitCanBeRetrievedFromInput(){
        int input = 5670;
        cryptography.separateSecondDigit(input);
        assertEquals(6, cryptography.getSecondInput());
    }

    @Test
    void testThatFirstDigitCanBeRetrievedFromInput(){
        int input = 1982;
        cryptography.separateFirstDigit(input);
        assertEquals(1, cryptography.getInput());
    }

    @Test
    void testThatSevenCanBeAddedToBeFourthDigit(){
        int input = 1234;
        cryptography.separateFourthDigit(input);
        int encryptedFourthDigit = cryptography.encryptFourthDigit();
        // int encryptedFourthDigit = cryptography.encryptFourthDigit(); == encryptedFourthDigit (in assert)
        assertEquals(1, encryptedFourthDigit);
    }

    @Test
    void testThatSevenCanBeAddedToBeThirdDigit(){
        int input = 4321;
        cryptography.separateThirdDigit(input);
        int encryptedThirdDigit = cryptography.encryptThirdDigit();
        assertEquals(9, encryptedThirdDigit);
    }

    @Test
    void testThatSevenCanBeAddedToBeSecondDigit(){
        int input = 6754;
        cryptography.separateSecondDigit(input);
        int encryptedSecondDigit = cryptography.encryptSecondDigit();
        assertEquals(4, encryptedSecondDigit);
    }

    @Test
    void testThatSevenCanBeAddedToBeFirstDigit(){
        int input = 2197;
        cryptography.separateFirstDigit(input);
        int encryptedFirstDigit = cryptography.encryptFirstDigit();
        assertEquals(9, encryptedFirstDigit);
    }

    @Test
    void testThatAllDigitsCanSeparated(){
        int input = 2981;
        cryptography.separateAllDigits(input);
        int number = Integer.parseInt(cryptography.getSeparatedDigits());
        assertEquals(2981, number);
    }

    @Test
    void testThatEncryptedDigitsCanBePrinted(){
        int input = 4563;
        cryptography.separateAllDigits(input);
        int number = Integer.parseInt(cryptography.getSeparatedDigits());
        assertEquals("3012", cryptography.getEncryptedDigits());
    }

}