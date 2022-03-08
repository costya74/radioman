package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio volume = new Radio();
    Radio station = new Radio();

    @Test
    public void sholdRadio() {
        Radio volume = new Radio();

        Radio volume2 = new Radio(15, 0, 100, true);

        Radio volume3 = new Radio(0, 0, 9);

      }

    @Test
    public void sholdincreaseVolumeOutOfRangeMax() {

        volume.setIncreaseVolume(101);
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdincreaseVolumeMax() {

        volume.setIncreaseVolume(100);
        int expected = 100;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdincreaseVolumeMin() {

        volume.setIncreaseVolume(0);
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdincreaseVolumeOutOfRangeMin() {

        volume.setIncreaseVolume(-1);
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdincreaseVolumeInOfRange() {

        volume.setIncreaseVolume(5);
        int expected = 5;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStation() {

        station.setCurrentStation(5);
        int expected = 5;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationOutOfRangeMax() {

        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationOutOfRangeMin() {

        station.setCurrentStation(-1);
        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeByOneForward() {

        volume.setIncreaseVolume(100);
        volume.increaseVolumeByOneForward();
        int expected = 100;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeByOneForwardBonder() {

        volume.setIncreaseVolume(0);
        volume.increaseVolumeByOneForward();
        int expected = 1;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeByOneForwardBonderMin() {

        volume.setIncreaseVolume(-1);
        volume.increaseVolumeByOneForward();
        int expected = 1;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeByOneForwardBonderMax() {

        volume.setIncreaseVolume(100);
        volume.increaseVolumeByOneForward();
        int expected = 100;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeByOneForwardAvg() {

        volume.setIncreaseVolume(5);
        volume.increaseVolumeByOneForward();
        int expected = 6;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeByOneBack() {

        volume.setIncreaseVolume(1);
        volume.increaseVolumeByOneBack();
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeByOneBackBonderMax() {

        volume.setIncreaseVolume(100);
        volume.increaseVolumeByOneBack();
        int expected = 99;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeByOneBackBonderMin() {

        volume.setIncreaseVolume(0);
        volume.increaseVolumeByOneBack();
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationByOneForward() {

        station.setCurrentStation(7);
        station.currentStationByOneForward();
        int expected = 8;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationByOneForwardBonderMin() {

        station.setCurrentStation(0);
        station.currentStationByOneForward();
        int expected = 1;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationByOneForwardBonderMax() {

        station.setCurrentStation(9);
        station.currentStationByOneForward();
        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationByOneBack() {

        station.setCurrentStation(7);
        station.currentStationByOneBack();
        int expected = 6;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationByOneBackBonderMax() {

        station.setCurrentStation(9);
        station.currentStationByOneBack();
        int expected = 8;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationByOneBackBonderMin() {

        station.setCurrentStation(0);
        station.currentStationByOneBack();
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

}
