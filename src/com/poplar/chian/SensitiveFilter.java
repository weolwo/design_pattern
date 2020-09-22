package com.poplar.chian;

/**
 * Create BY poplar ON 2020/9/22
 */
public class SensitiveFilter implements Filter {

    //每个处理器的处理逻辑
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String content = request.getContent();
        content = content.replace("Fuck", "F**k");//替换敏感词，实际开发中我们可以从数据库或者缓存中获取敏感词
        request.setContent(content);
        filterChain.doFilter(request, response);
        String responseContent = response.getContent();
        responseContent += "SensitiveFilter";
        response.setContent(responseContent);
    }
}
