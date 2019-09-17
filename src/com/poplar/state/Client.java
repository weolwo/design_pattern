package com.poplar.state;

/**
 * Created By poplar on 2019/9/17
 * 测试类
 */
public class Client {

    public static void main(String[] args) {

        //开始活动，奖品总数为 1
        RaffleActivity activity = new RaffleActivity(1);
        //来个连续10次抽奖
        for (int i = 1; i < 11; i++) {
            System.out.println("第【" + i + "】次抽奖");
            //扣积分
            activity.deduceMoney();
            //抽奖
            activity.raffle();
        }
    }
}
