package com.poplar.proxy;

/**
 * Created By poplar on 2019/9/14
 * 演员
 * 演员的符合经纪公司的标准或者行业标准
 */
public class Actor implements BrokerageFirm {
    @Override
    public void ordinaryActor(Double money) {
        System.out.println(money + " 钱已到位，小鲜肉开始平淡无奇的表演");
    }

    @Override
    public void highLevel(Double money) {
        System.out.println(money + " 钱已到位，影帝开始惊艳的表演");
    }
}
