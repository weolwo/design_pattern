package com.poplar.builder;

/**
 * Created By poplar on 2019/9/11
 * 普通版手机组装
 */
public class NormalVersionPhoneBuilder implements PhoneBuilder {

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

    /**
     * 生产完成
     *
     * @return
     */
    @Override
    public Phone assembleComplete() {
        assembleCPU("麒麟990");
        assembleRAM("8G");
        assembleROM("128G");
        assembleSize(6.3D);
        assemblePixel("48M");
        assembleName("华为Mate30标准版");
        return phone;
    }
}
