package com.meng.builder;

public class Command {


    public Product build(Builder builder){
        builder.buildA();
        builder.buildC();
        builder.buildB();

        return builder.getProduct();
    }
    public Product build02(Builder builder){
        builder.buildA();
        builder.buildB();

        return builder.getProduct();
    }

}
