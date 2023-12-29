package org.agarwal.Strategy;

public class ClickOpenCloseStrategy implements  OpenCloseStrategy{
    @Override
    public void open() {
        System.out.println("Clock open");
    }

    @Override
    public void close() {
        System.out.println("Click close");
    }
}
