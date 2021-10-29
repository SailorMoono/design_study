package com.meng.fanctory.absfactory;

public class XiaoMiRoute implements IRoute {
    @Override
    public void start() {
        System.out.println("小米路由器开启!");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器打开WiFi");
    }
}
