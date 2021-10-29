package com.meng.fanctory.absfactory;


//抽象工厂模式
public class Consumer {
    public static void main(String[] args) {
        Ifactory huaweifactory = new HuaweiFactory();
        IPhone phone = huaweifactory.phoneProduct();
        phone.start();
        phone.sendMessage();

        Ifactory xiaomifactory = new XiaoMiFactory();
        IPhone xiaomi = xiaomifactory.phoneProduct();
        xiaomi.start();
        xiaomi.sendMessage();

        IRoute route = xiaomifactory.routeProduct();
        route.start();
        route.openWifi();

    }
}
