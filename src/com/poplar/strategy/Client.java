package com.poplar.strategy;

/**
 * Created By poplar on 2019/9/13
 * 使用者
 */
public class Client {

    public static void main(String[] args) {
        //调用加法策略
        Context context = new Context(new AddStrategy());
        System.out.println(context.calculator(1, 3));

        //调用减法策略
        Context context1 = new Context();
        context1.setStrategy(new SubStrategy());
        System.out.println(context1.calculator(2, 4));
    }
}
