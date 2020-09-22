package com.poplar.chian;

import java.util.ArrayList;
import java.util.List;

/**
 * Create BY poplar ON 2020/9/22
 */
public class FilterChain {

    private static final List<Filter> filters = new ArrayList<>();

    private int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index == filters.size()) return;
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
