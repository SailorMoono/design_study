package com.meng.fanctory.absfactory;

public class XiaoMiPhone implements IPhone {
    @Override
    public void start() {
        System.out.println("小米手机开机!");
    }

    @Override
    public void sendMessage() {
        System.out.println("小米手机发送消息!");
    }
}
