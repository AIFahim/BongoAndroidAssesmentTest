package com.example.myapplication.DesignPattern.FactoryDesignPattern.BeansClasses;

public class Plane implements Vehicle {

    private int wheelnum , passengernum;
    private boolean has_gas;

    public Plane(int wheelnum, int passengernum, boolean has_gas) {
        this.wheelnum = wheelnum;
        this.passengernum = passengernum;
        this.has_gas = has_gas;
    }

    @Override
    public int get_num_of_wheels() {
        return wheelnum;
    }

    @Override
    public int get_num_of_passengers() {
        return passengernum;
    }

    @Override
    public boolean has_gas() {
        return has_gas;
    }
}
