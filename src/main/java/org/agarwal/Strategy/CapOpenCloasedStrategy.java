package org.agarwal.Strategy;

public class CapOpenCloasedStrategy implements OpenCloseStrategy{
    @Override
    public void open() {
        System.out.println("Cap open");
    }

    @Override
    public void close() {
        System.out.println("Cap close");
    }
}
