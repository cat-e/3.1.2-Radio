package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    void shouldUpStationMiddle() {
        Radio radio = new Radio("name");
        radio.setCurrentRadioStation(10);
        radio.setMinRadioStation(2);
        radio.setMaxRadioStation(10);
        radio.changeNextRadioStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    void shouldUpStationMax() {
        Radio radio1 = new Radio("name");
        radio1.setCurrentRadioStation(10);
        radio1.setMinRadioStation(3);
        radio1.setMaxRadioStation(10);
        radio1.changeNextRadioStation();
        assertEquals(3, radio1.getCurrentRadioStation());
    }

    @Test
    void shouldDownStationMiddle() {
        Radio radio2 = new Radio("name", 10);
        radio2.setMinRadioStation(2);
        radio2.setCurrentRadioStation(0);
        radio2.changePrevRadioStation();
        assertEquals(9, radio2.getCurrentRadioStation());
    }

    @Test
    void shouldDownStationFromMin() {
        Radio radio3 = new Radio("name", 10);
        radio3.setMinRadioStation(3);
        radio3.setMaxRadioStation(2);
        radio3.setCurrentRadioStation(4);
        radio3.changePrevRadioStation();
        assertEquals(2, radio3.getCurrentRadioStation());

    }

    @Test
    void shouldVolumeUpMiddle() {
        Radio radio4 = new Radio("name", 2, 100);
        radio4.setMinVolume(0);
        radio4.volumeUp();
        assertEquals(3, radio4.getCurrentVolume());
    }

    @Test
    void shouldVolumeUpMax() {
        Radio radio5 = new Radio("name", 2, 100);
        radio5.setMinVolume(0);
        radio5.setCurrentVolume(100);
        radio5.volumeUp();
        assertEquals(100, radio5.getCurrentVolume());


    }

    @Test
    void shouldVolumeDownMiddle() {
        Radio radio6 = new Radio("name", 50, 100, 0);
        radio6.volumeDown();
        assertEquals(49, radio6.getCurrentVolume());
    }

    @Test
    void shouldVolumeDownMin() {
        Radio radio7 = new Radio("name", 100, 100, 0);
        radio7.setCurrentVolume(0);
        radio7.volumeDown();
        assertEquals(0, radio7.getCurrentVolume());

    }
}
