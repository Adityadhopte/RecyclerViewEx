package com.example.recyclerviewex.model;

public class CarModel {

    String carName;
    int carImage;

    public CarModel(String carName, int carImage) {
        this.carName = carName;
        this.carImage = carImage;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarImage() {
        return carImage;
    }

    public void setCarImage(int carImage) {
        this.carImage = carImage;
    }
}
