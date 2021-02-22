package FirstSetOfTddPractice.Television;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    Television tv;

    @BeforeEach
    void setUp() {
        tv = new Television("LG");
    }

    @AfterEach
    void tearDown() {
        tv = null;
    }

    @Test
    void testThatNameIsSetByDefault(){
        // given that we have new object from the class

        // when, tv = new Television("LG");
        // set something

        // assert (get)
        assertEquals("LG", tv.getTvName());
    }

    @Test
    void testThatNameCanBeChanged(){
        String newName = "Sharp";
        tv.changeTvName(newName);
        assertEquals("Sharp", tv.getTvName());
    }

    @Test
    void testThatTvCanSwitchOn(){
        boolean isOn = true;
        tv.isOn(isOn);
        assertTrue(tv.getOn());
    }

    @Test
    void testThatTvCanSwitchOff(){
        boolean isOn = false;
        tv.isOn(isOn);
        assertFalse(tv.getOn());
    }

    @Test
    void testThatTvCanSetChannel(){
        boolean isOn = true;
        tv.isOn(isOn);
        int channel = 1;
        tv.setChannel(channel);
        assertEquals(1,tv.getChannel());
    }

    @Test
    void testThatTvCantBeSetChannelWhenSwitchedOff(){
        boolean isOn = false;
        tv.isOn(isOn);
        int channel = 1;
        tv.setChannel(channel);
        assertEquals(0,tv.getChannel());
    }

    @Test
    void testThatTvCantSetChannelWhenChannelNumberIsGreaterThanTwenty(){
        boolean isOn = true;
        tv.isOn(isOn);
        int channel = 21;
        tv.setChannel(channel);
        assertEquals(1, tv.getChannel());
    }

    @Test
    void testThatTvCantSetChannelWhenChannelNumberIsLessThanOne(){
        boolean isOn = true;
        tv.isOn(isOn);
        int channel = -9;
        tv.setChannel(channel);
        assertEquals(1, tv.getChannel());
    }

    @Test
    void testThatTvCanChangeToNextChannelWhenSwitchedOn(){
        boolean isOn = true;
        tv.isOn(isOn);
        int channel = 4;
        tv.setChannel(channel);
        tv.setNextChannel();
        assertEquals(5, tv.getChannel());
    }

    @Test
    void testThatTvCantChangeToNextChannelWhenSwitchedOff(){
        boolean isOn = false;
        tv.isOn(isOn);
        int channel = 9;
        tv.setNextChannel();
        assertEquals(0, tv.getChannel());
    }

    @Test
    void testThatTvCanChangeToPreviousChannelWhenSwitchedOn(){
        boolean isOn = true;
        tv.isOn(isOn);
        int channel = 10;
        tv.setChannel(channel);
        tv.setPreviousChannel();
        assertEquals(9, tv.getChannel());
    }

    @Test
    void testThatTvCantChangeToPreviousChannelWhenSwitchedOff(){
        boolean isOn = false;
        tv.isOn(isOn);
        int channel = 21;
        tv.setPreviousChannel();
        assertEquals(0, tv.getChannel());
    }

    @Test
    void testThatTvCanSetVolumeWhenSwitchedOn(){
        boolean isOn = true;
        tv.isOn(isOn);
        int volume = 1;
        tv.setVolume(volume);
        assertEquals(1, tv.getVolume());
    }

    @Test
    void testThatTvCantSetVolumeWhenSwitchedOff(){
        boolean isOn = false;
        tv.isOn(isOn);
        int volume = 1;
        tv.setVolume(volume);
        assertEquals(0, tv.getVolume());
    }

    @Test
    void testThatTvCantSetVolumeWhenVolumeNumberIsGreaterThanHundred(){
        boolean isOn = true;
        tv.isOn(isOn);
        int volume = 101;
        tv.setVolume(volume);
        assertEquals(0, tv.getVolume());
    }

    @Test
    void testThatTvCantSetVolumeWhenVolumeNumberIsLessThanOne(){
        boolean isOn = true;
        tv.isOn(isOn);
        int volume = -9;
        tv.setVolume(volume);
        assertEquals(0, tv.getVolume());
    }

    @Test
    void testThatTvCanIncreaseVolumeWhenSwitchedOn(){
        boolean isOn = true;
        tv.isOn(isOn);
        int volume = 2;
        tv.setVolume(volume);
        tv.setIncreasedVolume();
        assertEquals(3, tv.getVolume());
    }

    @Test
    void testThatTvCantIncreaseVolumeWhenSwitchedOff(){
        boolean isOn = false;
        tv.isOn(isOn);
        int volume = 87;
        tv.setVolume(volume);
        tv.setIncreasedVolume();
        assertEquals(0, tv.getVolume());
    }

    @Test
    void testThatTvCanDecreaseVolumeWhenSwitchedOn(){
        boolean isOn = true;
        tv.isOn(isOn);
        int volume = 2;
        tv.setVolume(volume);
        tv.setDecreasedVolume();
        assertEquals(1, tv.getVolume());
    }

    @Test
    void testThatTvCantDecreaseVolumeWhenSwitchedOff(){
        boolean isOn = false;
        tv.isOn(isOn);
        int volume = 87;
        tv.setVolume(volume);
        tv.setDecreasedVolume();
        assertEquals(0, tv.getVolume());
    }

}