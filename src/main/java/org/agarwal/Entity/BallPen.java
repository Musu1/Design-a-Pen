package org.agarwal.Entity;

import org.agarwal.Strategy.CapOpenCloasedStrategy;
import org.agarwal.Strategy.OpenCloseStrategy;
import org.agarwal.constants.PenType;

public class BallPen extends Pen implements RefillPen{

    Refill refill;


    public BallPen(String brand, String name, double price, PenType type,Refill refill) {
        super(brand, name, price, PenType.BALL, new CapOpenCloasedStrategy());
        this.refill = refill;
    }

    @Override
    public boolean isRefillable() {
        return true;
    }

    @Override
    public void changeRefill(Refill refill) {
        if(isRefillable()){
            this.refill = refill;
        }
    }

    @Override
    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }
}
