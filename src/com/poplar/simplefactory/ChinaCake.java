package com.poplar.simplefactory;

/**
 * Created By poplar on 2019/9/11
 * 中式糕点
 */
public class ChinaCake implements Cake {

    private String name;

    public ChinaCake(String name) {
        this.name = name;
        prepare();
        bake();
        pack();
    }

    @Override
    public void prepare() {
        System.out.println(name + " 糕点正在准备...ing");
    }

    @Override
    public void bake() {
        System.out.println(name + " 糕点正在烘烤中");
    }

    @Override
    public void pack() {
        System.out.println(name + " 糕点正在包装");
    }
}
