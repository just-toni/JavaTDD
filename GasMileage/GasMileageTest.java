package FirstSetOfTddPractice.GasMileage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage automobile;

    @BeforeEach
    void setUp() {
        automobile = new GasMileage();
    }

    @AfterEach
    void tearDown() {
        automobile = null;
    }

    @Test
    void testThatNumberOfTripsCanBeCollected(){
        int numberOfTrips = 4;
        automobile.collectNumberOfTrips(numberOfTrips);
        assertEquals(4, automobile.getNumberOfTrips());
    }

//    @Test
//    void testThatNumberOfTripsCollectedCanDetermineTheNumberOfTimesInputWillBeCollected(){
//        int numberOfTrips = 3;
//        automobile.collect
//    }

    @Test
    void testThatMilesDrivenCanBeCollected(){
        int milesDriven = 7;
        automobile.collectMilesDriven(milesDriven);
        assertEquals(7, automobile.getMilesDriven());
    }

    @Test
    void testThatMilesDrivenInputLessThanOneCantBeCollected(){
        int milesDriven = -1;
        automobile.collectMilesDriven(milesDriven);
        assertEquals(0, automobile.getMilesDriven());
    }

    @Test
    void testThatGallonsUsedCanBeCollected(){
        int gallonsUsed = 7;
        automobile.collectGallonsUsed(gallonsUsed);
        assertEquals(7, automobile.getGallonsUsed());
    }

    @Test
    void testThatGallonsUsedInputLessThanOneCantBeCollected(){
        int gallonsUsed = -12;
        automobile.collectGallonsUsed(gallonsUsed);
        assertEquals(0, automobile.getGallonsUsed());
    }

    @Test
    void testThatMilesPerGallonCanBeCalculated(){
        int milesDriven = 9;
        int gallonsUsed = 3;
        automobile.calculateMilesPerGallon(milesDriven, gallonsUsed);
        assertEquals(3, automobile.getMilesPerGallon());
    }

    @Test
    void testThatTotalNumberOfMilesPerGallonCanBeCalculated(){
        int milesPerGallon = 4;
//        int milesPerGallon = 6;
        automobile.calculateSumOfMilesPerDriven(milesPerGallon);
    }
}