package com.meng.builder.builder02;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker.buildA("建造A").buildB("建造B").buildC("建造C").getProduct();
        System.out.println(product);

    }
}
