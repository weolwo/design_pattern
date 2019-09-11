package com.poplar.simplefactory;

/**
 * Created By poplar on 2019/9/11
 */
public class Client {
    public static void main(String[] args) {
        Factory.productCake("west");
        System.out.println("**************************************");
        Factory.productCake("china");
    }

}
