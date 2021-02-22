package FirstSetOfTddPractice.AirConditioner;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    private AirConditioner ac;

    @BeforeEach
    void setUp() {
        ac = new AirConditioner(false);
    }

    @AfterEach
    void tearDown() {
        ac = null;
    }

    @Test
    void testToSetProductName() {
        ac.setProductName("Panasonic");
        assertEquals("Panasonic", ac.getProductName());
    }

    @Test
    void testToCheckAirConditionerTemperatureWhenSwitchedOff(){
        assertEquals(0, ac.getTemperature());
    }

    @Test
    void testToCheckTemperatureOfAirConditionerWhenSwitchedOn(){
        AirConditioner ac = new AirConditioner(true);
        assertEquals(16, ac.getTemperature());
    }

    @Test
    void testThatAirConditionerCanSwitchOn() {
        ac.switchOn(true);
        assertTrue(ac.isOn());
    }

    @Test
    void testThatAirConditionerCanSwitchOff() {
        ac.switchOn(false);
        assertFalse(ac.isOn());
    }

    @Test
    void testThatDefaultTemperatureWhenAirConditionerIsOn_16(){
        ac.switchOn(true);
    }

    @Test
    void testThatTemperatureCanBeSetWhenAirConditionerIsOn() {
        ac.switchOn(true);
        assertEquals(16, ac.getTemperature());
    }

    @Test
    void testThatTemperatureCannotBeSetWhenAirConditionerIsOff() {
        ac.switchOn(false);
        ac.setTemperature(0);
        assertEquals(0, ac.getTemperature());
    }

    @Test
    void testThatTemperatureCanBeIncreasedWhenAirConditionerIsOn() {
        ac.switchOn(true);
        ac.setIncreasedTemperature(18);
        assertEquals(19, ac.getIncreasedTemperature());
    }

    @Test
    void testThatTemperatureCanBeIncreasedWhenAirConditionerIsOff() {
        ac.switchOn(false);
        ac.setIncreasedTemperature(16);
        assertEquals(0, ac.getIncreasedTemperature());
    }

    @Test
    void testThatTemperatureCanBeDecreasedWhenAirConditionerIsOn() {
        ac.switchOn(true);
        ac.setDecreasedTemperature(25);
        assertEquals(24, ac.getDecreasedTemperature());
    }

    @Test
    void testThatTemperatureCanBeDecreasedWhenAirConditionerIsOff() {
        ac.switchOn(false);
        ac.setDecreasedTemperature(25);
        assertEquals(0, ac.getDecreasedTemperature());
    }
}
