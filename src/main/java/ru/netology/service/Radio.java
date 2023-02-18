package ru.netology.service;

public class Radio {
    protected int currentRadioStationNumber; //текущий номер станции
    protected int currentVolume;  // текущая громкость
    protected int minimumNumberOfChannels = 0;
    protected int maximumNumberOfChannels;

    protected int minVolume = 0;
    protected int maxVolume = 100;

    public Radio() {
        maximumNumberOfChannels = 9;
    }


    public Radio(int size) {
        maximumNumberOfChannels = minimumNumberOfChannels + size;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void manualStationSelection(int manualStationInput) {      // ручной выбор станции
        if (manualStationInput >= minimumNumberOfChannels && manualStationInput <= maximumNumberOfChannels) {
            currentRadioStationNumber = manualStationInput;
        } else {
            currentRadioStationNumber = minimumNumberOfChannels;
        }
    }


    public void nextRadioStationNumber() {  //выбор станции кнопкой Next
        if (currentRadioStationNumber >= minimumNumberOfChannels && currentRadioStationNumber < maximumNumberOfChannels) {
            currentRadioStationNumber++;
        } else if (currentRadioStationNumber == maximumNumberOfChannels) {
            currentRadioStationNumber = minimumNumberOfChannels;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber > minimumNumberOfChannels && currentRadioStationNumber <= maximumNumberOfChannels) {
            currentRadioStationNumber--;
        } else if (currentRadioStationNumber == minimumNumberOfChannels) {
            currentRadioStationNumber = maximumNumberOfChannels;
        } else {
            currentRadioStationNumber = minimumNumberOfChannels;
        }
    }

    public void increaseVolume() {       // повышение громкости
        if (currentVolume >= minVolume && currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return;
        } else if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume = minVolume;
            return;
        }
    }

    public void reduceVolume() {    //понижение громкости
        if (currentVolume > minVolume && currentVolume <= maxVolume) {
            currentVolume = currentVolume - 1;
        } else if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume = minVolume;
        }

    }

}