package com.meng.builder.builder02;

public class Worker extends Builder {

    Product product;
    public Worker(){
        this.product = new Product();
    }

    @Override
    Builder buildA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    Builder buildB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    @Override
    Builder buildC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
