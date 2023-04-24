package ru.netology.javaqa;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public void increaseVolume() {
        if (currentVolume < 100) {
            int volumeIncreased = currentVolume + 1;
            setCurrentVolume(volumeIncreased);
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            int volumeReduced = currentVolume - 1;
            setCurrentVolume(volumeReduced);
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == 9) {
            setCurrentStation(0);
        } else {
            int nextStation = currentStation + 1;
            setCurrentStation(nextStation);
        }

    }

    public void prev() {
        if (currentStation == 0) {
            setCurrentStation(9);
        } else {
            int prevStation = currentStation - 1;
            setCurrentStation(prevStation);
        }
    }
}