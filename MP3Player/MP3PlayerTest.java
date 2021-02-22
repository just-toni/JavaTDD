package FirstSetOfTddPractice.MP3Player;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MP3PlayerTest {
     MP3Player playlist1;

    @BeforeEach
    void setUp() {
        playlist1 = new MP3Player();
    }

    @AfterEach
    void tearDown() {
        playlist1 = null;
    }

    @Test
    void testThatMP3PlayerCanSwitchOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        assertTrue(playlist1.getOn());
    }

    @Test
    void testThatMP3PlayerCanSwitchOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        assertFalse(playlist1.getOn());
    }

    @Test
    void testThatMP3PlayerCanPlayWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        assertTrue(playlist1.getPlay());
    }

    @Test
    void testThatMP3PlayerCantPlayWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        assertFalse(playlist1.getPlay());
    }

    @Test
    void testThatMP3PlayerCanPauseWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        assertFalse(playlist1.getPlay());
    }

    @Test
    void testThatMP3PlayerCantPauseWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        assertFalse(playlist1.getPlay());
    }

    @Test
    void testThatMP3PlayerCanSetCurrentPlayingTrackWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        int currentPlayingTrack = 34;
        playlist1.setCurrentPlayingTrack(currentPlayingTrack);
        assertEquals(34, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCantSetCurrentPlayingTrackWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        int currentPlayingTrack = 23;
        playlist1.setCurrentPlayingTrack(currentPlayingTrack);
        assertEquals(0, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanSetToPlayCurrentPlayingTrackWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int currentPlayingTrack = 34;
        playlist1.setCurrentPlayingTrack(currentPlayingTrack);
        assertEquals(34, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanSetToPauseCurrentPlayingTrackWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int currentPlayingTrack = 34;
        playlist1.setCurrentPlayingTrack(currentPlayingTrack);
        assertEquals(34, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCantSetToPlayCurrentPlayingTrackWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int currentPlayingTrack = 34;
        playlist1.setCurrentPlayingTrack(currentPlayingTrack);
        assertEquals(0, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCantSetToPauseCurrentPlayingTrackWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int currentPlayingTrack = 4;
        playlist1.setCurrentPlayingTrack(currentPlayingTrack);
        assertEquals(0, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanChangeToNextTrackWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        int nextTrack = 4;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        assertEquals(5, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCantChangeToNextTrackWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        int nextTrack = 4;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanChangeToPreviousTrackWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        int nextTrack = 79;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setPreviousTrack();
        assertEquals(78, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanChangeToPreviousTrackWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        int nextTrack = 87;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setPreviousTrack();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanChangeToNextTrackAndPlayWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        assertEquals(5, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanChangeToNextTrackAndPauseWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        assertEquals(5, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanChangeToPreviousTrackAndPlayWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int nextTrack = 79;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setPreviousTrack();
        assertEquals(78, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanChangeToPreviousTrackAndPauseWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int nextTrack = 79;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setPreviousTrack();
        assertEquals(78, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCantChangeToNextTrackAndPlayWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCantChangeToNextTrackAndPauseWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCantChangeToPreviousTrackAndPlayWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int nextTrack = 79;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setPreviousTrack();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCantChangeToPreviousTrackAndPauseWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int nextTrack = 79;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setPreviousTrack();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanSetVolumeWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        int volume = 15;
        playlist1.setVolume(volume);
        assertEquals(15, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantSetVolumeWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        int volume = 1;
        playlist1.setVolume(volume);
        assertEquals(0, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCanSetVolumeToPlayCurrentPlayingTrackWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int volume = 6;
        playlist1.setVolume(volume);
        assertEquals(6, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCanSetVolumeToPauseCurrentPlayingTrackWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int volume = 8;
        playlist1.setVolume(volume);
        assertEquals(8, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantSetVolumeToPlayCurrentPlayingTrackWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int volume = 3;
        playlist1.setVolume(volume);
        assertEquals(0, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantSetVolumeToPauseCurrentPlayingTrackWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int volume = 7;
        playlist1.setVolume(volume);
        assertEquals(0, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCanIncreaseVolumeWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        int volume = 4;
        playlist1.setVolume(volume);
        playlist1.setIncreasedVolume();
        assertEquals(5, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantIncreaseVolumeWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        int volume = 4;
        playlist1.setVolume(volume);
        playlist1.setIncreasedVolume();
        assertEquals(0, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCanDecreaseVolumeWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        int volume = 9;
        playlist1.setVolume(volume);
        playlist1.setDecreasedVolume();
        assertEquals(8, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantDecreaseVolumeWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        int nextTrack = 7;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setPreviousTrack();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
    }

    @Test
    void testThatMP3PlayerCanChangeToNextTrackIncreaseVolumeAndPlayWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        playlist1.setVolume(volume);
        playlist1.setIncreasedVolume();
        assertEquals(5, playlist1.getCurrentPlayingTrack());
        assertEquals(6, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCanChangeToNextTrackIncreaseVolumeAndPauseWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        playlist1.setVolume(volume);
        playlist1.setIncreasedVolume();
        assertEquals(5, playlist1.getCurrentPlayingTrack());
        assertEquals(6, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantChangeToNextTrackIncreaseVolumeAndPlayWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        playlist1.setVolume(volume);
        playlist1.setIncreasedVolume();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
        assertEquals(0, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantChangeToNextTrackIncreaseVolumeAndPauseWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        playlist1.setVolume(volume);
        playlist1.setIncreasedVolume();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
        assertEquals(0, playlist1.getVolume());
    }


    @Test
    void testThatMP3PlayerCanChangeToNextTrackDecreaseVolumeAndPlayWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        playlist1.setVolume(volume);
        playlist1.setDecreasedVolume();
        assertEquals(5, playlist1.getCurrentPlayingTrack());
        assertEquals(4, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCanChangeToNextTrackDecreaseVolumeAndPauseWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        playlist1.setVolume(volume);
        playlist1.setDecreasedVolume();
        assertEquals(5, playlist1.getCurrentPlayingTrack());
        assertEquals(4, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantChangeToNextTrackDecreaseVolumeAndPlayWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        playlist1.setVolume(volume);
        playlist1.setDecreasedVolume();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
        assertEquals(0, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantChangeToNextTrackDecreaseVolumeAndPauseWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int nextTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(nextTrack);
        playlist1.setNextTrack();
        playlist1.setVolume(volume);
        playlist1.setDecreasedVolume();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
        assertEquals(0, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCanChangeToPreviousTrackIncreaseVolumeAndPlayWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int previousTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(previousTrack);
        playlist1.setPreviousTrack();
        playlist1.setVolume(volume);
        playlist1.setIncreasedVolume();
        assertEquals(3, playlist1.getCurrentPlayingTrack());
        assertEquals(6, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCanChangeToPreviousTrackIncreaseVolumeAndPauseWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int previousTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(previousTrack);
        playlist1.setPreviousTrack();
        playlist1.setVolume(volume);
        playlist1.setIncreasedVolume();
        assertEquals(3, playlist1.getCurrentPlayingTrack());
        assertEquals(6, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantChangeToPreviousTrackIncreaseVolumeAndPlayWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int previousTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(previousTrack);
        playlist1.setPreviousTrack();
        playlist1.setVolume(volume);
        playlist1.setIncreasedVolume();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
        assertEquals(0, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantChangeToPreviousTrackIncreaseVolumeAndPauseWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int previousTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(previousTrack);
        playlist1.setPreviousTrack();
        playlist1.setVolume(volume);
        playlist1.setIncreasedVolume();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
        assertEquals(0, playlist1.getVolume());
    }


    @Test
    void testThatMP3PlayerCanChangeToPreviousTrackDecreaseVolumeAndPlayWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int previousTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(previousTrack);
        playlist1.setPreviousTrack();
        playlist1.setVolume(volume);
        playlist1.setDecreasedVolume();
        assertEquals(3, playlist1.getCurrentPlayingTrack());
        assertEquals(4, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCanChangeToPreviousTrackDecreaseVolumeAndPauseWhenSwitchedOn(){
        boolean isOn = true;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int previousTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(previousTrack);
        playlist1.setPreviousTrack();
        playlist1.setVolume(volume);
        playlist1.setDecreasedVolume();
        assertEquals(3, playlist1.getCurrentPlayingTrack());
        assertEquals(4, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantChangeToPreviousTrackDecreaseVolumeAndPlayWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = true;
        playlist1.isPlay(isPlay);
        int previousTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(previousTrack);
        playlist1.setPreviousTrack();
        playlist1.setVolume(volume);
        playlist1.setDecreasedVolume();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
        assertEquals(0, playlist1.getVolume());
    }

    @Test
    void testThatMP3PlayerCantChangeToPreviousTrackDecreaseVolumeAndPauseWhenSwitchedOff(){
        boolean isOn = false;
        playlist1.isOn(isOn);
        boolean isPlay = false;
        playlist1.isPlay(isPlay);
        int previousTrack = 4;
        int volume = 5;
        playlist1.setCurrentPlayingTrack(previousTrack);
        playlist1.setPreviousTrack();
        playlist1.setVolume(volume);
        playlist1.setDecreasedVolume();
        assertEquals(0, playlist1.getCurrentPlayingTrack());
        assertEquals(0, playlist1.getVolume());
    }
}