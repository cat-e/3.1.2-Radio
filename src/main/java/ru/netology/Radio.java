package ru.netology;

public class Radio {
    private int currentRadioStation;
    private boolean on;
    private int maxRadioStation;
    private int minRadioStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;
    private boolean next = true;
    private boolean prev = true;
    private boolean plus = true;
    private boolean minus = true;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public boolean isPlus() {
        return plus;
    }

    public void setPlus(boolean plus) {
        this.plus = plus;
    }

    public boolean isMinus() {
        return minus;
    }

    public void setMinus(boolean minus) {
        this.minus = minus;
    }

    public boolean isNext() {
        return next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    public boolean isPrev() {
        return prev;
    }

    public void setPrev(boolean prev) {
        this.prev = prev;
    }


    public void changeNextRadioStation() {
            currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }

    }

    public void changePrevRadioStation() {
            currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }

    }
    public void volumeUp() {
            currentVolume = currentVolume + 1;
        if (currentVolume >= 10) currentVolume = 10; {
            return;
        }
    }

    public void volumeDown() {
            currentVolume = currentVolume - 1;
        if (currentVolume <= 0) currentVolume = 0; {
            return;
        }
    }


    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }


    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    private int soundVolume;

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }


}
