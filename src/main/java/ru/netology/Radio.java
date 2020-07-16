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


    public void changeNextRadioStation() {
        currentRadioStation++;
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }

    }


    public void changePrevRadioStation() {
        currentRadioStation--;
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }

    }


    public void volumeUp() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }


    public void volumeDown() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

}
