package com.meng.builder;

public class Worker extends Builder {
    Product product;
    public Worker(){
        this.product = new Product();
    }

    @Override
    public void buildA() {
        product.setBuildA("建造A");
    }

    @Override
    public void buildB() {
        product.setBuildB("建造B");
    }

    @Override
    public void buildC() {
        product.setBuildC("建造C");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
