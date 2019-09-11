package com.poplar.builder;

/**
 * Created By poplar on 2019/9/11
 * Pro 版手机组装建造者
 */
public class ProVersionPhoneBuilder implements PhoneBuilder {
    @Override
    public void assembleCPU(String cpu) {
        phone.setCPU(cpu);
    }

    @Override
    public void assembleROM(String rom) {
        phone.setRam(rom);
    }

    @Override
    public void assembleRAM(String ram) {
        phone.setRom(ram);
    }

    @Override
    public void assembleSize(Double size) {
        phone.setSize(size);
    }

    @Override
    public void assemblePixel(String pixel) {
        phone.setPixel(pixel);
    }

    @Override
    public void assembleName(String name) {
        phone.setName(name);
    }

    @Override
    public Phone assembleComplete() {
        assembleCPU("麒麟990-5G版");
        assembleRAM("8G");
        assembleROM("256G");
        assembleSize(6.7D);
        assemblePixel("48M");
        assembleName("华为Mate30 PRO版");
        return phone;
    }
}
