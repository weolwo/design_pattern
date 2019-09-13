package com.poplar.facade;

/**
 * Created By poplar on 2019/9/13
 * 客户
 */
public class Client {
    public static void main(String[] args) {
        PortfolioManager portfolioManager = new PortfolioManager();
        //购买基金
        portfolioManager.buyFund("华润集团", 999999, 10000.00);
        System.out.println("**********************************************");
        //购买股票
        portfolioManager.buyStock("国家电网", 888888, 90000.00);
    }
}
