package com.meng.fanctory.simple;

public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        String car = factory.getCar("byd").getCarName();
        System.out.println(car);
    }
}
