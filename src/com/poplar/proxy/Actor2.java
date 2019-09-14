package com.poplar.proxy;

/**
 * Created By poplar on 2019/9/14
 * 演员类，基于cglib的代理
 */
public class Actor2 {

    public void ordinaryActor(Double money) {
        System.out.println(money + " 钱已到位，小鲜肉开始平淡无奇的表演");
    }

    public void highLevel(Double money) {
        System.out.println(money + " 钱已到位，影帝开始惊艳的表演");
    }
}
