package com.meng.builder;

public class Test {
    public static void main(String[] args) {
        Command command = new Command();
        Product product = command.build(new Worker());
        System.out.println(product);
        System.out.println(command.build02(new Worker()));
    }
}
