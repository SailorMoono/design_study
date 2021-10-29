package com.meng.fanctory.absfactory;

public class HuaweiRoute implements IRoute {
    @Override
    public void start() {
        System.out.println("华为路由器开启!");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器打开WiFi");
    }
}
