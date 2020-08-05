package com.example.myapplication.DesignPattern.FactoryDesignPattern.FactoryClasses;

import com.example.myapplication.DesignPattern.FactoryDesignPattern.BeansClasses.Car;
import com.example.myapplication.DesignPattern.FactoryDesignPattern.BeansClasses.Vehicle;

public class CarFactory extends AbstractVehicalFactory{

    private int wheelNum , passengersNum;


    public CarFactory(int wheelNum, int passengersNum) {
        this.wheelNum = wheelNum;
        this.passengersNum = passengersNum;
    }

    @Override
    Vehicle createVehicle() {
        if(wheelNum != 4)
        {
            return new Car(wheelNum,passengersNum,false);
        }
        else if(passengersNum == 0)
        {
            return new Car(wheelNum , passengersNum , false);
        }
        else
            return new Car(wheelNum , passengersNum ,true);
    }
}
