package com.meng.fanctory.absfactory;

public class XiaoMiFactory implements Ifactory {
    @Override
    public IPhone phoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRoute routeProduct() {
        return new XiaoMiRoute();
    }
}
