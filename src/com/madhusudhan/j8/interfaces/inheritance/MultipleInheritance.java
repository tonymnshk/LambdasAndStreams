package com.madhusudhan.j8.interfaces.inheritance;

interface  Engine {
    default String model(int id) {
        return "DEFAULT ENGINE";
    }
}

interface  Vehicle extends Engine {
    default String model(int id) {
        return "DEFAULT ENGINE";
    }
}

class Car implements Engine, Vehicle {

    @Override
    public String model(int id) {
        return Vehicle.super.model(id);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

    }
}
