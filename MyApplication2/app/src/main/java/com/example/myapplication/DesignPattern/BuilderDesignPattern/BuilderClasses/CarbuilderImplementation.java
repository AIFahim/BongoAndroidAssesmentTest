package com.example.myapplication.DesignPattern.BuilderDesignPattern.BuilderClasses;

import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.Car;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.ICarbuilder;
import com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses.Vehicle;

public class CarbuilderImplementation implements ICarbuilder {

    private Car car;

    public CarbuilderImplementation(){
        car = new Car();
    }

    @Override
    public Car build() {
        set_has_gas();
        return car;
    }

    @Override
    public ICarbuilder set_num_of_wheels(int num_of_wheels) {
        car.set_num_of_wheels(num_of_wheels);
        return this;
    }

    @Override
    public ICarbuilder set_num_of_passengers(int num_of_passengers) {
        car.set_num_of_passengers(num_of_passengers);
        return this;
    }

    private void set_has_gas() {
        if(car.get_num_of_wheels() != 4) {
            car.setHas_gas(false);
        } else if(car.get_num_of_passengers() == 0) {
            car.setHas_gas(false);
        } else {
            car.setHas_gas(true);
        }
    }


    @Override
    public ICarbuilder has_gas() {
        return this;
    }
}
