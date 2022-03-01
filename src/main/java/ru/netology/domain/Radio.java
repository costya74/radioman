package ru.netology.domain;

public class Radio {
    private int increaseVolume;
    private int currentStation;

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setIncreaseVolume(int increaseVolume) {
        if (increaseVolume > 10) {
            return;
        }
        if (increaseVolume < 0) {
            return;
        }
        this.increaseVolume = increaseVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            currentStation = 0;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }
    public void currentStationByOneForward() {
        if (currentStation < 9) {
            setCurrentStation(currentStation + 1);
        }
    }

    public void currentStationByOneBack() {
        if (currentStation > 0) {
            setCurrentStation(currentStation - 1);
        }
    }

    public void increaseVolumeByOneForward() {
        if (increaseVolume < 10) {
            setIncreaseVolume(increaseVolume + 1);
        }
    }

    public void increaseVolumeByOneBack() {
        if (increaseVolume > 0) {
            setIncreaseVolume(increaseVolume - 1);
        }
    }


}









