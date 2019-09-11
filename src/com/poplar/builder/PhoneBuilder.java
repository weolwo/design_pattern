package com.poplar.builder;

/**
 * Created By poplar on 2019/9/11
 * 建造者接口
 */
public interface PhoneBuilder {
    Phone phone = new Phone();
    /*组装CPU*/
    void assembleCPU(String cpu);

    /*组装ROM*/
    void assembleROM(String rom);

    /*组装RAM*/
    void assembleRAM(String ram);

    /*手机尺寸选择*/
    void assembleSize(Double size);

    /*相机组装*/
    void assemblePixel(String pixel);

    void assembleName(String name);

    Phone assembleComplete();

}
