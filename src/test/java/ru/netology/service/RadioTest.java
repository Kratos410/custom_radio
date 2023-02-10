package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radio = new Radio();

    @Test

    public void manualStationInput() {
        Radio radio = new Radio(25);
        radio.setManualStationSelection(4);
        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void manualStationInputPositiveValues() {

        radio.setManualStationSelection(22);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualStationInputNegativeValues() {

        radio.setManualStationSelection(-7);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextChannelUpperBound() {

        radio.currentRadioStationNumber = 9;
        radio.nextRadioStationNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannelAbroad() {

        radio.currentRadioStationNumber = -8;
        radio.nextRadioStationNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {

        radio.currentRadioStationNumber = 2;
        radio.nextRadioStationNumber();
        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {

        radio.currentRadioStationNumber = 5;
        radio.prevRadioStationNumber();
        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannelAbroad() {

        radio.currentRadioStationNumber = 22;
        radio.prevRadioStationNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannelLowerBound() {

        radio.currentRadioStationNumber = 0;
        radio.prevRadioStationNumber();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolume() {

        radio.currentVolume = 0;
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeAbroad() {

        radio.currentVolume = -1;
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeUpUperBound() {

        radio.currentVolume = 100;
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolume() {

        radio.currentVolume = 10;
        radio.reduceVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeAbroad() {

        radio.currentVolume = 150;
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeLowerBound() {

        radio.currentVolume = 0;
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
