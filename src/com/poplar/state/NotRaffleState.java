package com.poplar.state;

/**
 * Created By poplar on 2019/9/17
 * 不能抽奖状态
 */
public class NotRaffleState implements State {

    /*初始化时传入活动引用，扣除积分后改变其状态*/
    private RaffleActivity raffleActivity = null;

    public NotRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("扣除积分成功，赶快去抽奖吧！");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    /*当前状态不能抽奖*/
    @Override
    public boolean raffle() {
        System.out.println("积分扣除成功才可以抽奖哦！");
        return false;
    }

    /*当前状态不能颁奖*/
    @Override
    public void dispensePrize() {
        System.out.println("你还没抽奖呢，赶快去抽奖吧！");
    }
}
