package com.meng.fanctory.factory;

public class Consumer {
    public static void main(String[] args) {
        Factory teSiLaFactory = new TeSiLaFactory();
        Car car = teSiLaFactory.getCar();
        System.out.println(car.getCarName());
    }

}
