package com.madhusudhan.j8.interfaces.inheritingbehaviour;

interface Engine {
    default String make() {
        return "Default MAKE";
    }
}

interface Vehicle {
    default String model() {
        return "Default MODEL";
    }
}

class Car implements Engine, Vehicle {
    String makeAndModel() {
        return Engine.super.make() + " and " +
                Vehicle.super.model();
    }

}


public class InheritingBehaviour {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.makeAndModel());
        System.out.println(car.make() + " and " + car.model());
    }
}
