package com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses;

public class Plane {
    private int num_of_wheels, num_of_passengers;
    private boolean has_gas;

    public Plane() {
    }

    public int get_num_of_wheels() {
        return num_of_wheels;
    }

    public void set_num_of_wheels(int num_of_wheels) {
        this.num_of_wheels = num_of_wheels;
    }


    public int get_num_of_passengers() {
        return num_of_passengers;
    }





    public void set_num_of_passengers(int num_of_passengers) {
        this.num_of_passengers = num_of_passengers;
    }

    public boolean has_gas() {
        return has_gas;
    }

    public void setHas_gas(boolean has_gas) {
        this.has_gas = has_gas;
    }
}
