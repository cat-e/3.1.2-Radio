package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private String name;
    private int currentRadioStation;
    private boolean on;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean next = true;
    private boolean prev = true;
    private boolean plus = true;
    private boolean minus = true;


    public void changeNextRadioStation() {
        currentRadioStation++;
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }

    }

    public Radio(String name) {
        this.name = name;
    }


    public void changePrevRadioStation() {
        currentRadioStation--;
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }

    }

    public Radio(String name, int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public void volumeUp() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }

    public Radio(String name, int currentVolume, int maxVolume) {
        this.name = name;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
    }

    public void volumeDown() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
    }

    public Radio(String name, int currentVolume, int maxVolume, int minVolume) {
        this.name = name;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;

    }
}
