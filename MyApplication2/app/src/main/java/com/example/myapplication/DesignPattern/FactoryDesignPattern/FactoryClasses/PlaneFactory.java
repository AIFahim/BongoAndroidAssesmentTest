package com.example.myapplication.DesignPattern.FactoryDesignPattern.FactoryClasses;

import com.example.myapplication.DesignPattern.FactoryDesignPattern.BeansClasses.Plane;
import com.example.myapplication.DesignPattern.FactoryDesignPattern.BeansClasses.Vehicle;

public class PlaneFactory extends AbstractVehicalFactory{
    private int wheelNum , PasengerNum;

    public PlaneFactory(int wheelNum, int PasengerNum) {
        this.wheelNum = wheelNum;
        this.PasengerNum = PasengerNum;
    }

    @Override
    Vehicle createVehicle() {
       if(wheelNum != 3)
           return new Plane(wheelNum , PasengerNum , false);
       else if(PasengerNum == 0)
           return new Plane(wheelNum , PasengerNum , false);
       else
           return new Plane(wheelNum , PasengerNum , true);
    }
}
