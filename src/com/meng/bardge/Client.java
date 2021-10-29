package com.meng.bardge;


/*
* 桥接模式
* 增加品牌和电脑类型很方便
*
*桥接模式类似于多继承方案。桥接模式提高了系统的可扩充性，在两个变化的
* 维度中任意扩展一个维度都不需要修改原有系统。符合开闭原则。就像一座桥吧变化的两个维度连接起来
* */


public class Client {
    public static void main(String[] args) {
        Computer apple = new Desktop(new Apple());
        apple.info();

        Computer xiaomi = new Laptop(new XiaoMi());
        xiaomi.info();
    }
}
