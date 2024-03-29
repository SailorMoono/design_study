package com.meng.builder.builder02;

public abstract class Builder {
    abstract Builder buildA(String msg);
    abstract Builder buildB(String msg);
    abstract Builder buildC(String msg);

    abstract Product getProduct();
}
