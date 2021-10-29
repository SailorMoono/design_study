package com.meng.fanctory.simple;

public class Factory {
    public Car getCar(String car){
        if(car == "byd"){
            return new Byd();
        }
        if(car == "tsl"){
            return new TeSiLa();
        }
            return null;

    }
}
