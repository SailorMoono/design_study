package com.meng.fanctory.factory;

public class BydFactory implements Factory {
    @Override
    public Car getCar() {
        return new Byd();
    }
}
