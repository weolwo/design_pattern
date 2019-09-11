package com.poplar.builder;

/**
 * Created By poplar on 2019/9/11
 * 需求:
 * 建造者模式中的产品,也就是最终需要的东西,假设我们最终生产的的是手机
 */
public class Phone {

    private String name;

    /*处理器*/
    private String CPU;

    /*能存多少东西*/
    private String rom;

    /*RAM的大小直接决定了你在手机后台能开多少程序*/
    private String ram;

    private Double size;

    /*像素*/
    private String pixel;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getPixel() {
        return pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name +
                "  处理器 : '" + CPU + '\'' +
                ", ROM : '" + rom + '\'' +
                ", RAM : '" + ram + '\'' +
                ", 尺寸 : " + size +
                ", 像素 : '" + pixel + '\'';
    }
}
