package com.poplar.chian;

/**
 * Create BY poplar ON 2020/9/22
 */
public class HarmScriptFilter implements Filter{

    //每个处理器的处理逻辑
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String content = request.getContent();
       content= content.replace("<","【").replace(">","】");//避免恶意代码被浏览器解析
        request.setContent(content);
        filterChain.doFilter(request,response);
        String responseContent = response.getContent();
        responseContent+="---->HarmScriptFilter";
        response.setContent(responseContent);
    }
}
