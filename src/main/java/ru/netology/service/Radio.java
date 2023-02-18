package ru.netology.service;

public class Radio {
    protected int currentRadioStationNumber; //текущий номер станции
    protected int currentVolume;  // текущая громкость


    protected int minVolume = 0;
    protected int maxVolume = 100;

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

    public Radio(int size) {
        maximumNumberOfChannels = minimumNumberOfChannels + size;
    }

    public Radio() {
        maximumNumberOfChannels = 9;
    }


    public void manualStationSelection(int manualStationInput) {      // ручной выбор станции
        if (manualStationInput >= minimumNumberOfChannels && manualStationInput <= maximumNumberOfChannels) {

            currentRadioStationNumber = manualStationInput;
        } else {
            currentRadioStationNumber = 0;
        }
    }


    public void nextRadioStationNumber() {  //выбор станции кнопкой Next
        if (currentRadioStationNumber >= 0 && currentRadioStationNumber < 9) {
            currentRadioStationNumber++;
        } else if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = 1;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber > 0 && currentRadioStationNumber <= 9) {
            currentRadioStationNumber--;
        } else if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber = 1;
        }
    }


    public void increaseVolume() {       // повышение громкости
        if (currentVolume >= minVolume && currentVolume < maxVolume) {

            currentVolume = currentVolume + 1;
        } else if (currentVolume == 10) {
            currentVolume = 10;
        } else {
            currentVolume = 0;
        }
    }

    public void reduceVolume() {    //понижение громкости

        if (currentVolume > minVolume && currentVolume <= maxVolume) {

            currentVolume = currentVolume - 1;
        } else if (currentVolume == 0) {
            return;
        } else {
            currentVolume = 0;
        }

    }

}