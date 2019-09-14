package com.poplar.flyweight;

/**
 * Created By poplar on 2019/9/14
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        WebSite webSite = WebSiteFactory.getWebSiteCategory("新闻");
        webSite.use(new User("猫花"));

        System.out.println("**********************************************");
        WebSite webSite2 = WebSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("萌猫"));

        WebSite webSite3 = WebSiteFactory.getWebSiteCategory("新闻");
        webSite.use(new User("小腿猫"));

        System.out.println("**********************************************");
        WebSite webSite4 = WebSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("萌猫崽"));

        System.out.println("当前实例数量: "+WebSiteFactory.getInstanceCount());
    }
}
