package com.sunshine.webproject.web.domain.dto.response.results;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author sunshine
 * @date :2020/2/17 20:57
 * @description: 分页数据返回类
 */
@ApiModel("分页数据返回类")
public class PagingResult<T> extends DataResult<T>{
    @ApiModelProperty(name = "page",value = "页面号")
    private int page;

    @ApiModelProperty(name = "pageSize",value = "页面条数")
    private int pageSize;

    @ApiModelProperty(name = "total",value = "总数据量")
    private int total;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
