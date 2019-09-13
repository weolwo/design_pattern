package com.poplar.facade;

/**
 * Created By poplar on 2019/9/13
 * 基金经理
 * 由于股票和基金都需要掌握一定的金融知识,一般人操作起来费时费力,而基金公司刚好对这方面比较在行
 * 我们可以通过基金公司买卖股票
 */
public class PortfolioManager {

    private Stock stock = null;

    private Fund fund = null;

    public PortfolioManager() {
        this.stock = new Stock();
        this.fund = new Fund();
    }

    /**
     * 客户付款成功后基金公司帮忙托管
     * 只需要把最后的结果告诉客户就行了
     *
     * @param name
     * @param code
     */
    public void buyFund(String name, Integer code, Double price) {
        System.out.println(fund.buyFund(name, code, price));
    }

    /**
     * 客户付款成功后基金公司帮忙托管
     * 只需要把最后的结果告诉客户就行了
     *
     * @param name
     * @param code
     */
    public void buyStock(String name, Integer code, Double price) {
        System.out.println(stock.buyStock(name, code, price));
    }
}
