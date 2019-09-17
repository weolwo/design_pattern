package com.poplar.state;

/**
 * Created By poplar on 2019/9/17
 * 状态顶层接口类
 */
public interface State {
    /*扣积分*/
    void deduceMoney();

    /*抽奖是否成功*/
    boolean raffle();

    /*发奖*/
    void dispensePrize();
}
