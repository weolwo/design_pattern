package com.poplar.state;

import java.util.Random;

/**
 * Created By poplar on 2019/9/17
 * 可以抽奖状态
 */
public class CanRaffleState implements State {

    private RaffleActivity raffleActivity = null;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("你已经扣过积分啦");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖中，请稍等");
        Random random = new Random();
        int num = random.nextInt(10);//获取一个0 --10的随机数
        if (num == 1) {
            System.out.println("恭喜你，中奖了！");
            raffleActivity.setState(raffleActivity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾，奖品与你擦肩而过！");
            //改变为不能抽奖
            raffleActivity.setState(raffleActivity.getNotRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("你还没状奖，不能发放奖品");
    }
}
