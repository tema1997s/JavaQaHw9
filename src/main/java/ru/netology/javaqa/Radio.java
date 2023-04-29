package ru.netology.javaqa;

public class Radio {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int quantityOfStations = 10;
    private int currentStation = minStation;

    public Radio(int quantity) {
        this.quantityOfStations = quantity;
        this.maxStation = quantityOfStations - 1;
    }

    public Radio() {
        this.maxStation = 9;
        this.quantityOfStations = 10;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            int volumeIncreased = currentVolume + 1;
            setCurrentVolume(volumeIncreased);
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            int volumeReduced = currentVolume - 1;
            setCurrentVolume(volumeReduced);
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
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
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else {
            int nextStation = currentStation + 1;
            setCurrentStation(nextStation);
        }

    }

    public void prev() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else {
            int prevStation = currentStation - 1;
            setCurrentStation(prevStation);
        }
    }
}