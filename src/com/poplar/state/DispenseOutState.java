package com.poplar.state;

/**
 * Created By poplar on 2019/9/17
 * 奖品发放完毕的状态，抽奖活动结束
 */
public class DispenseOutState implements State {

    private RaffleActivity activity = null;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("抽奖活动已结束，请下次再来参与吧！");
    }

    @Override
    public boolean raffle() {
        System.out.println("抽奖活动已结束，请下次再来参与吧！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("抽奖活动已结束，请下次再来参与吧！");

    }
}
