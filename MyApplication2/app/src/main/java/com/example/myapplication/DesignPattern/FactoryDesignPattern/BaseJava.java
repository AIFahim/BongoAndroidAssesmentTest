package com.example.myapplication.DesignPattern.FactoryDesignPattern;

import android.util.Log;

import com.example.myapplication.DesignPattern.FactoryDesignPattern.BeansClasses.Vehicle;
import com.example.myapplication.DesignPattern.FactoryDesignPattern.BeansClasses.VehicleType;
import com.example.myapplication.DesignPattern.FactoryDesignPattern.FactoryClasses.VehicleFactory;

public class BaseJava {
    Vehicle car = VehicleFactory.createVehicle(VehicleType.Car , 0 , 2);
    //Log.e("","");

}
