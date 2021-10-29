package com.meng.adapter;

public class Computer {
//    电脑需要连网需要适配器
    public void net(NetTousb adapter){
//        上网的具体实现  ，找一个适配器
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();        //网线
        Adapter adapter = new Adapter(adaptee); //适配器
        computer.net(adapter);
    }
}
