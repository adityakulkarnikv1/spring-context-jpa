package org.example.test1;


public class Car {
    
    private Engine engine;
    private String model;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println(this.model + " Model car is driving");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
    }

    public Car(Engine engine, String model) {
        this.engine = engine;
        this.model = model;
    }

}
