package com.meng.fanctory.absfactory;

public class HuaweiFactory implements Ifactory {
    @Override
    public IPhone phoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRoute routeProduct() {
        return new HuaweiRoute();
    }
}
