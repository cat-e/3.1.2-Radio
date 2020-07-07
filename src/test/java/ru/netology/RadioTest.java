package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldChangeStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(6);
        radio.changeNextRadioStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

}