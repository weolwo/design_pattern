package com.poplar.simplefactory;

/**
 * Created By poplar on 2019/9/11
 * 西式糕点
 */
public class WestCake implements Cake {
    private String name;

    public WestCake(String name) {
        this.name = name;
        prepare();
        bake();
        pack();
    }

    @Override
    public void prepare() {
        System.out.println(name + " 糕点正在准备....ing");
    }

    @Override
    public void bake() {
        System.out.println(name + " 糕点烘烤中");
    }

    @Override
    public void pack() {
        System.out.println(name + " 糕点包装中");
    }
}
