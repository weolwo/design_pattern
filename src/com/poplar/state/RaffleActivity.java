package com.poplar.state;

/**
 * Created By poplar on 2019/9/17
 * 环境类
 */
public class RaffleActivity {
    /*表示当前活动的状态，是变化*/
    private State state = null;

    /*奖品数*/
    private int prize = 0;
    /*四种状态*/
    private State notRaffleState = new NotRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);
    private State dispenseState = new DispenseState(this);
    private State dispenseOutState = new DispenseOutState(this);

    //初始化活动

    public RaffleActivity(int prize) {
        //默认为不能抽奖
        this.state = notRaffleState;
        this.prize = prize;
    }

    //扣积分,调用当前状态的 deduceMoney()
    public void deduceMoney() {
        state.deduceMoney();
    }

    /*抽奖*/
    public void raffle() {
        //如果当前状态是抽奖成功， 就领取奖品
        if (state.raffle()) {
            state.dispensePrize();
        }
    }

    /*每次发放奖品后，奖品的总数量应该不断减少*/
    public int getPrize() {
        int currentPrize = prize;
        prize--;
        return currentPrize;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public State getNotRaffleState() {
        return notRaffleState;
    }

    public void setNotRaffleState(State notRaffleState) {
        this.notRaffleState = notRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
