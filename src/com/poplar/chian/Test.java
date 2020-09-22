package com.poplar.chian;

/**
 * Create BY poplar ON 2020/9/22
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        Request request = new Request("<script language=\"JavaScript\">  \n" +
                "    while (1) {  \n" +
                "      window.top.moveBy(0,100);  \n" +
                "      window.top.moveBy(100,0);  \n" +
                "      window.top.moveBy(0,-100);  \n" +
                "      window.top.moveBy(-100,0);  \n" +
                "    }  \n" +
                "</script>   Fuck 阿三猴子 😂😡");
        Response response = new Response("【摸底老仙，法力无边】");
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HarmScriptFilter()).add(new SensitiveFilter());
        filterChain.doFilter(request,response);
        System.out.println(request.getContent());
        System.out.println(response.getContent());
    }
}
