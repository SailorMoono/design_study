package com.meng.fanctory.absfactory;

public class HuaweiPhone implements IPhone {
    @Override
    public void start() {
        System.out.println("华为手机开机!");
    }

    @Override
    public void sendMessage() {
        System.out.println("华为手机发送消息!");
    }
}
