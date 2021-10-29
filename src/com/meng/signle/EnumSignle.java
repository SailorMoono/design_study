package com.meng.signle;

public enum EnumSignle {
    INSTANCE;
    int i = 0;
    public EnumSignle getInstance(){
        return INSTANCE;
    }
    public void doSomething(){
        System.out.println("hello");
    }
}
