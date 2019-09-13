package com.poplar.facade;

/**
 * Created By poplar on 2019/9/13
 * 基金
 */
public class Fund {
    private String name;

    private Integer code;

    private Double price;

    /**
     * 购买基金的方法
     *
     * @param name 基金名称
     * @param code 基金代码
     * @return
     */
    public Fund buyFund(String name, Integer code, Double price) {
        Fund fund = new Fund();
        fund.setCode(code);
        fund.setName(name);
        fund.setPrice(price);
        return fund;
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
        return "基金: " +
                "name: '" + name + '\'' +
                ", code: " + code + " 购买金额: " + price;
    }
}
