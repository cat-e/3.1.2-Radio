package ru.netology;

import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldUpStationMiddle() {
        Radio radio = new Radio("name", 0, false, 10, 0, 100, 100, 0);
        radio.changeNextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldUpStationMax() {
        Radio radio1 = new Radio("name", 10, false, 10, 2, 100, 100, 0);
        radio1.changeNextRadioStation();
        assertEquals(2, radio1.getCurrentRadioStation());
    }

    @Test
    void shouldDownStationMiddle() {
        Radio radio2 = new Radio("name", 2, false, 10, 1, 100, 100, 0);
        radio2.changePrevRadioStation();
        assertEquals(1, radio2.getCurrentRadioStation());
    }

    @Test
    void shouldDownStationFromMin() {
        Radio radio3 = new Radio("name", 4, false, 10, 0, 100, 100, 0);
        radio3.setMinRadioStation(3);
        radio3.setMaxRadioStation(2);
        radio3.setCurrentRadioStation(2);
        radio3.changePrevRadioStation();
        assertEquals(2, radio3.getCurrentRadioStation());

    }

    @Test
    void shouldVolumeUpMiddle() {
        Radio radio4 = new Radio("name", 0, false, 10, 0, 2, 100, 0);
        radio4.volumeUp();
        assertEquals(3, radio4.getCurrentVolume());
    }

    @Test
    void shouldVolumeUpMax() {
        Radio radio5 = new Radio("name", 0, false, 10, 0, 100, 100, 0);
        radio5.volumeUp();
        assertEquals(100, radio5.getCurrentVolume());


    }

    @Test
    void shouldVolumeDownMiddle() {
        Radio radio6 = new Radio("name", 0, false, 10, 0, 50, 100, 0);
        radio6.volumeDown();
        assertEquals(49, radio6.getCurrentVolume());
    }

    @Test
    void shouldVolumeDownMin() {
        Radio radio7 = new Radio("name", 0, false, 10, 0, 0, 100, 0);
        radio7.volumeDown();
        assertEquals(0, radio7.getCurrentVolume());

    }
}
