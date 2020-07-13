package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    private Radio radio = new Radio("name");
    private Radio radio1 = new Radio("name",0);
    private Radio radio2 = new Radio("name",40,100);
    private Radio radio3 = new Radio("name",100,100,0);

    @Test
    void shouldUpStation() {
        Radio radio = new Radio("name");
        radio.setCurrentRadioStation(4);
        radio.setMinRadioStation(0);
        radio.setMaxRadioStation(10);
        radio.changeNextRadioStation();
        assertEquals(5,radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(10);
        radio.setMinRadioStation(0);
        radio.setMaxRadioStation(10);
        radio.changeNextRadioStation();
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    void shouldDownStation() {
        Radio radio1 = new Radio("name",0);
        radio1.setCurrentRadioStation(4);
        radio1.setMaxRadioStation(10);
        radio1.changePrevRadioStation();
        assertEquals(3,radio1.getCurrentRadioStation());

        radio1.setCurrentRadioStation(0);
        radio1.setMaxRadioStation(10);
        radio1.changePrevRadioStation();
        assertEquals(10,radio1.getCurrentRadioStation());

    }

    @Test
    void shouldVolumeUp() {
        Radio radio2 = new Radio("name",2,100);
        radio2.setMinVolume(0);
        radio2.volumeUp();
        assertEquals(3,radio2.getCurrentVolume());

        radio2.setMinVolume(0);
        radio2.setCurrentVolume(100);
        radio2.volumeUp();
        assertEquals(100,radio2.getCurrentVolume());



    }

    @Test
    void shouldVolumeDown() {
        Radio radio3 = new Radio("name",100,100,0);
        radio3.volumeDown();
        assertEquals(99,radio3.getCurrentVolume());


        radio3.setCurrentVolume(0);
        radio3.volumeDown();
        assertEquals(0,radio3.getCurrentVolume());

    }
}
