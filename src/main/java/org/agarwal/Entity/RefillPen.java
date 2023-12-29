package org.agarwal.Entity;

public interface RefillPen {

    boolean isRefillable();
    void changeRefill(Refill refill);
    Refill getRefill();
}
