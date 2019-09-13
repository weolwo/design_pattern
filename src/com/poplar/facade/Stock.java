package com.poplar.facade;

/**
 * Created By poplar on 2019/9/13
 * 股票
 */
public class Stock {
    private String name;

    private Integer code;

    private Double price;

    /**
     * 购买股票的方法
     *
     * @param name 股票名称
     * @param code 股票代码
     * @return
     */
    public Stock buyStock(String name, Integer code, Double price) {
        Stock stock = new Stock();
        stock.setCode(code);
        stock.setName(name);
        stock.setPrice(price);
        return stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "股票: " +
                "name: '" + name + '\'' +
                ", code: " + code + "" +
                " 购买金额: " + price;
    }

}
