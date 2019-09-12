package com.poplar.decorator;

/**
 * Created By poplar on 2019/9/12
 * 咖啡店
 */
public class CoffeeShop {

    public static void main(String[] args) {
        //需求:点一份原味的美式咖啡
        Drink order = new LongCoffee();
        System.out.println(order.getName() +"  " + order.getPrice()+"\n总金额 : "+order.computerCost());

        System.out.println("-------------------加入牛奶------------------------------");
        //加一分牛奶
        order = new Milk(order);
        System.out.println(order.getName() + " \n总金额: " + order.computerCost());

        System.out.println("--------------------加入巧克力-----------------------------");
        order = new Chocolate(order);
        System.out.println(order.getName() + " \n总金额: " + order.computerCost());

        System.out.println("--------------------加入豆浆-----------------------------");
        order = new Soy(order);
        System.out.println(order.getName() + " \n总金额: " + order.computerCost());

        System.out.println("--------------------加入拉菲-----------------------------");
        order = new RedWine(order);
        System.out.println(order.getName() + " \n总金额: " + order.computerCost());
    }
}
