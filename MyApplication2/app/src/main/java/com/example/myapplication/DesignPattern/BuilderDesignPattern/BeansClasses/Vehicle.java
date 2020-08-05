package com.example.myapplication.DesignPattern.BuilderDesignPattern.BeansClasses;

public interface Vehicle {
    Vehicle set_num_of_wheels(int num_of_wheels);
    Vehicle set_num_of_passengers(int num_of_passengers);
    Vehicle has_gas();
}
