package com.example.myapplication.DesignPattern.BuilderDesignPattern.BuilderClasses;

import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.IPlaneBuilder;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.Plane;
import com.example.myapplication.DesignPattern.FactoryDesignPattern.BeansClasses.Vehicle;

public class PlanebuilderImplementation implements IPlaneBuilder {
    private Plane plane;

    public PlanebuilderImplementation() {
        plane = new Plane();
    }

    @Override
    public Plane build() {
        set_has_gas();
        return plane;
    }

    @Override
    public IPlaneBuilder set_num_of_wheels(int num_of_wheels) {
        plane.set_num_of_wheels(num_of_wheels);
        return this;
    }

    @Override
    public IPlaneBuilder set_num_of_passengers(int num_of_passengers) {
        plane.set_num_of_passengers(num_of_passengers);
        return this;
    }

    private void set_has_gas() {
        if(plane.get_num_of_wheels() != 3) {
            plane.setHas_gas(false);
        } else if(plane.get_num_of_passengers() == 0) {
            plane.setHas_gas(false);
        } else {
            plane.setHas_gas(true);
        }
    }

    @Override
    public IPlaneBuilder has_gas() {
        return this;
    }
}
