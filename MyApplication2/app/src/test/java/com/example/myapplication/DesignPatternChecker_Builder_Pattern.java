package com.example.myapplication;

import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.Car;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.Plane;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BuilderClasses.CarbuilderImplementation;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BuilderClasses.PlanebuilderImplementation;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BuilderClasses.Vehicalbuilder;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.Vehicle;

import org.junit.Test;

import static org.junit.Assert.*;

public class DesignPatternChecker_Builder_Pattern {
    @Test
    public void DesignPatternCheck()  throws  Exception{

        Vehicle vehicleCar = new CarbuilderImplementation().set_num_of_wheels(3).set_num_of_passengers(3);
        Car car = new Vehicalbuilder(vehicleCar).buildCar();

       Vehicle vehiclePlane = new PlanebuilderImplementation().set_num_of_wheels(0).set_num_of_passengers(3);
      Plane plane = new Vehicalbuilder(vehiclePlane).buildPlane();

        if (plane != null) assertFalse(new Vehicalbuilder(vehiclePlane).buildPlane().has_gas());
        //System.out.println(plane.has_gas());

        if (car != null) assertFalse(new Vehicalbuilder(vehiclePlane).buildCar().has_gas());
       // System.out.println(car.has_gas());



    }
}
