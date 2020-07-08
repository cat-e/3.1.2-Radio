package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldUpStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.changeNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(3);
        radio.changeNextRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDownStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.changePrevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(6);
        radio.changePrevRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.volumeUp();
        assertEquals(9, radio.getCurrentVolume());

        radio.setCurrentVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(7);
        radio.volumeDown();
        assertEquals(6, radio.getCurrentVolume());
    }
}
