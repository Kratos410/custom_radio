package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test

    public void manualStationInput() {
        Radio radio = new Radio();
        radio.setManualStationSelection(4);
        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void manualStationInputPositiveValues() {
        Radio radio = new Radio();
        radio.setManualStationSelection(22);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualStationInputNegativeValues() {
        Radio radio = new Radio();
        radio.setManualStationSelection(-7);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextChanneUpperBound() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 9;
        radio.nextRadioStationNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannelAbroad() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = -8;
        radio.nextRadioStationNumber();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 2;
        radio.nextRadioStationNumber();
        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 5;
        radio.prevRadioStationNumber();
        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannelAbroad() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 22;
        radio.prevRadioStationNumber();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannelLowerBound() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 0;
        radio.prevRadioStationNumber();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeAbroad() {
        Radio radio = new Radio();
        radio.currentVolume = -1;
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeUpUperBound() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.reduceVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeAbroad() {
        Radio radio = new Radio();
        radio.currentVolume = 15;
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeLowerBound() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
