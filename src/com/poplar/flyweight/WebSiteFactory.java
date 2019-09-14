package com.poplar.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By poplar on 2019/9/14
 */
public class WebSiteFactory {
    private static Map<String, WebSite> map = new HashMap<>();

    public static WebSite getWebSiteCategory(String type) {
        if (!map.containsKey(type)) {
            map.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) map.get(type);
    }

    /**
     * 获取当前实例个数
     *
     * @return
     */
    public static Integer getInstanceCount() {
        return map.size();
    }
}
