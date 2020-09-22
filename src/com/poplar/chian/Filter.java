package com.poplar.chian;

/**
 * Create BY poplar ON 2020/9/22
 * 所有处理器都必须实现该接口
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}
