package FirstSetOfTddPractice.WPG;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WPGTest {
    WPG wpg;

    @BeforeEach
    void setUp() {
        wpg = new WPG();
    }

    @AfterEach
    void tearDown() {
        wpg = null;
    }

    @Test
    void testThatOneToSeventyFiveNumberOfYearsCanBePrinted(){
        int year = 75;
        wpg.setYear(year);
        assertEquals(76, wpg.getYear());
    }

    @Test
    void testThatPopulationPerYearCanBeCalculated(){
        double population = 7800000000L;
        wpg.calculatePopulationOfFirstYear(population);
        assertEquals(7881900000L, wpg.getPopulation());
    }

    @Test
    void testThatGrowthRateCanBeCalculated(){
        double growthRate = 1.05/100;
        wpg.calculatePopulationIncrement(growthRate);
        assertEquals(32567, wpg.getPopulationIncrement());
    }
}