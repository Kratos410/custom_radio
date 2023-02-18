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

        radio.setCurrentRadioStationNumber(9);
        radio.nextRadioStationNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannelAbroad() {

        radio.setCurrentRadioStationNumber(-8);
        radio.nextRadioStationNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {

        radio.setCurrentRadioStationNumber(2);
        radio.nextRadioStationNumber();
        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {

        radio.setCurrentRadioStationNumber(6);
        radio.prevRadioStationNumber();
        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannelAbroad() {

        radio.setCurrentRadioStationNumber(22);
        radio.prevRadioStationNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannelLowerBound() {

        radio.setCurrentVolume(0);
        radio.prevRadioStationNumber();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolume() {

        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeAbroad() {

        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeUpUperBound() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolume() {

        radio.setCurrentVolume(10);
        radio.reduceVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeAbroad() {

        radio.setCurrentVolume(150);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeLowerBound() {

        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
