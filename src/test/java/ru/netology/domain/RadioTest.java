package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void sholdincreaseVolumeOutOfRangeMax() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(11);
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdincreaseVolumeMax() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(10);
        int expected = 10;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdincreaseVolumeMin() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(0);
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdincreaseVolumeOutOfRangeMin() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(-1);
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdincreaseVolumeInOfRange() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(5);
        int expected = 5;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        int expected = 5;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationOutOfRangeMax() {
        Radio station = new Radio();
        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationOutOfRangeMin() {
        Radio station = new Radio();
        station.setCurrentStation(-1);
        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeByOneForward() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(10);
        volume.increaseVolumeByOneForward();
        int expected = 10;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void sholdIncreaseVolumeByOneForwardBonder() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(0);
        volume.increaseVolumeByOneForward();
        int expected = 1;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void sholdIncreaseVolumeByOneForwardBonderMin() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(-1);
        volume.increaseVolumeByOneForward();
        int expected = 1;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void sholdIncreaseVolumeByOneForwardBonderMax() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(11);
        volume.increaseVolumeByOneForward();
        int expected = 1;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void sholdIncreaseVolumeByOneForwardAvg() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(5);
        volume.increaseVolumeByOneForward();
        int expected = 6;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeByOneBack() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(1);
        volume.increaseVolumeByOneBack();
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void sholdIncreaseVolumeByOneBackBonderMax() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(10);
        volume.increaseVolumeByOneBack();
        int expected = 9;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void sholdIncreaseVolumeByOneBackBonderMin() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(0);
        volume.increaseVolumeByOneBack();
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void sholdCurrentStationByOneForward() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        station.currentStationByOneForward();
        int expected = 8;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void sholdCurrentStationByOneForwardBonderMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.currentStationByOneForward();
        int expected = 1;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationByOneForwardBonderMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.currentStationByOneForward();
        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void sholdCurrentStationByOneBack() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        station.currentStationByOneBack();
        int expected = 6;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void sholdCurrentStationByOneBackBonderMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.currentStationByOneBack();
        int expected = 8;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void sholdCurrentStationByOneBackBonderMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.currentStationByOneBack();
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

}

