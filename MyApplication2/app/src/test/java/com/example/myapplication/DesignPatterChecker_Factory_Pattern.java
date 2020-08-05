package com.example.myapplication;
import android.util.Log;
import android.widget.Toast;

import com.example.myapplication.DesignPattern.FactoryDesignPattern.BaseJava;
import com.example.myapplication.DesignPattern.FactoryDesignPattern.BeansClasses.Vehicle;
import com.example.myapplication.DesignPattern.FactoryDesignPattern.BeansClasses.VehicleType;
import com.example.myapplication.DesignPattern.FactoryDesignPattern.FactoryClasses.VehicleFactory;

import org.junit.Test;

import static org.junit.Assert.*;


public class DesignPatterChecker_Factory_Pattern {
    @Test
    public void DesignPatternCheck()  throws  Exception{
        BaseJava baseJava = new BaseJava();
        // assertTrue(!utils.isValidEmailAddress("foo@bar.com"));
        //assertTrue(utils.AnagramChecker("abcc","abca"));

        Vehicle car = VehicleFactory.createVehicle(VehicleType.Car, 4, 10);

        Vehicle plane = VehicleFactory.createVehicle(VehicleType.Plane, 3, 10);

        if(car != null) assertFalse(car.has_gas());

        if(plane != null) assertFalse(plane.has_gas());

//        System.out.println(plane.has_gas());
//        System.out.print(car.has_gas());

    }
}
