package com.example.myapplication.DesignPattern.BuilderDesignPattern.BuilderClasses;

import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.Car;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.ICarbuilder;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.IPlaneBuilder;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.Plane;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.Vehicle;

public class Vehicalbuilder {
    private ICarbuilder iCarBuilder;
    private IPlaneBuilder iPlaneBuilder;

    public Vehicalbuilder(Vehicle vehicle) {
        if(vehicle instanceof ICarbuilder) {
            this.iCarBuilder = (ICarbuilder) vehicle;
        } else {
            this.iPlaneBuilder = (IPlaneBuilder) vehicle;
        }
    }

    public Car buildCar() {
        return iCarBuilder.build();
    }

    public Plane buildPlane() {
        return iPlaneBuilder.build();
    }
}
