package com.poplar.flyweight;

/**
 * Created By poplar on 2019/9/14
 * 具体网站
 */
public class ConcreteWebSite implements WebSite {

    /*网站内部状态,这是网站的类型 ,可能是新闻,博客等*/
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    /*User是网站的外部状态,会随着环境的变化而变化*/
    @Override
    public void use(User user) {
        System.out.println(user.getName() + ": 正在使用【" + type + "】网站~~~~");
    }
}
