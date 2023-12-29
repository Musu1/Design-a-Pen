package org.agarwal.Entity;

import org.agarwal.Strategy.OpenCloseStrategy;
import org.agarwal.constants.PenType;

public abstract class Pen {
    String brand;
    String name;
    double price;
    PenType type;
    OpenCloseStrategy openCloseStrategy;

    public Pen(){

    }

    public Pen(String brand, String name, double price, PenType type, OpenCloseStrategy openCloseStrategy) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.type = type;
        this.openCloseStrategy = openCloseStrategy;
    }

    public void write(){
        System.out.println("Pen writes");
    }

    public void open(){
        openCloseStrategy.open();
    }

    public void close(){
        openCloseStrategy.close();
    }

}
