package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetAnotherStationAmount() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);
        Assertions.assertEquals(15, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSetNotExistStation1() {
        radio.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetNotExistStation2() {
        radio.setCurrentRadioStation(11);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldRemmemberStation() {
        radio.setCurrentRadioStation(5);
        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStation1() {

        radio.setCurrentRadioStation(10);
        radio.nextRadioStation();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStation2() {

        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();

        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStation() {

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        Assertions.assertEquals(10, radio.getCurrentRadioStation());

    }

    @Test
    public void prevStation1() {

        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStation2() {

        radio.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldRememberCurrentVolume() {

        radio.setCurrentVolume(3);

        Assertions.assertEquals(3, radio.getCurrentVolume());
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

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void turnUpVolume1() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void turnUpVolume2() {

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void turnDownVolume() {

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void turnDownVolume1() {

        radio.setCurrentVolume(1);
        radio.decreaseVolume();


        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
