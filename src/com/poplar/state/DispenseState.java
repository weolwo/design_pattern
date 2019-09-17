package com.poplar.state;

/**
 * Created By poplar on 2019/9/17
 * 发放奖品状态
 */
public class DispenseState implements State {

    private RaffleActivity activity = null;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("扣除积分失败");

    }

    @Override
    public boolean raffle() {
        System.out.println("扣除积分失败");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getPrize()>0){
            System.out.println("恭喜你，领取奖品成功！");
            //设置状态为不能抽奖
            activity.setState(activity.getNotRaffleState());
        }else {
            System.out.println("很遗憾，领取奖品失败！");
            //设置状态为不能抽奖
            activity.setState(activity.getDispenseOutState());
            System.exit(0);
        }
    }
}
