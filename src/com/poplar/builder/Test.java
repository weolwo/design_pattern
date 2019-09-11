package com.poplar.builder;

/**
 * Created By poplar on 2019/9/11
 * 测试类
 */
public class Test {

    /*它的主要作用就是将复杂事物创建的过程抽象出来，该抽象的不同实现方式不同，
    创建出的对象也不同。通俗的讲，创建一个对象一般都会有一个固定的步骤，
    这个固定的步骤我们把它抽象出来，每个抽象步骤都会有不同的实现方式，不同的实现方式创建出的对象也将不同。*/

    public static void main(String[] args) {

        //生产普通版手机
        Director director = new Director(new NormalVersionPhoneBuilder());
        System.out.println(director.productPhone());

        System.out.println("*****************************************");
        //生产高配版手机
        director.setPhoneBuilder(new ProVersionPhoneBuilder());
        System.out.println(director.productPhone());

    }
}
