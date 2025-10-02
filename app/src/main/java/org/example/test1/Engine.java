package org.example.test1;

public class Engine {

    private String type;
    
    public void start() {
        System.out.println("Engine " + this.type + " started");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine(String type) {
        this.type = type;
    }

    public Engine() {
    }
}
