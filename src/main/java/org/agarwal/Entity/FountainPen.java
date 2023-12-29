package org.agarwal.Entity;

import org.agarwal.Strategy.ClickOpenCloseStrategy;
import org.agarwal.Strategy.OpenCloseStrategy;
import org.agarwal.constants.PenType;

public class FountainPen extends Pen{
    Ink ink;
    Nib nib;

    public FountainPen(String brand, String name, double price, Ink ink, Nib nib) {
        super(brand, name, price, PenType.FOUNTAIN, new ClickOpenCloseStrategy());
        this.ink = ink;
        this.nib = nib;
    }
}
