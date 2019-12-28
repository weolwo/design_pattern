package com.poplar.observer.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created BY poplar ON 2019/12/28
 * 观察者的逻辑有可能十分复杂，它们可能还持有状态，抑或定义了多个方法，诸如此 类。在这些情形下，你还是应该继续使用类的方式。 8
 */
public class Feed implements Subject {

    private static List<Observer> list = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void notifyEachObserver(String t) {
        list.forEach(e -> e.notifyObserver(t));
    }

    public static void main(String[] args) {

        Feed feed = new Feed();

        feed.register(s -> {
            if (s != null && s.contains("money")) {
                System.out.println("我可以贷款了");
            }
        });

        //订阅自己感兴趣的
        feed.register(s -> {
            if (s != null && s.contains("discount")) {
                System.out.println("哈哈，清空购物车");
            }
        });

        feed.notifyEachObserver("中国工商银行信用卡购物享9 discount");
        feed.notifyEachObserver("中国工商银行信用卡新一轮提额活动开始啦money");
    }
}
