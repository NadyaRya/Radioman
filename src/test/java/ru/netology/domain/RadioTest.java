package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
public void currentRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetNotExistStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetNotExistStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 6;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextStationIfCurrentNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevStationIfCurrentZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        int actual = radio.getCurrentVolume();
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentVolumeIncorrect() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnUpVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnUpVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnDownVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnDownVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
}
