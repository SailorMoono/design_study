package com.meng.fanctory.factory;

public class TeSiLaFactory implements Factory {
    @Override
    public Car getCar() {
        return new TeSiLa();
    }
}
