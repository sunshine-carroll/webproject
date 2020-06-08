package com.sunshine.webproject.domain.dto.request;

import com.sunshine.webproject.domain.dto.request.support.Order;
import io.swagger.annotations.ApiModelProperty;

import java.util.Collections;
import java.util.List;

/**
 * 分页查询
 *
 * @author: sunshine
 * @date: 2020/5/28 17:43
 */
public class PagingQuery {

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    
    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/
    
    /*--------------------------------------------
    |         S T A T I C M E T H O D S         |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    @ApiModelProperty(name = "page",value = "页面号",required = true,dataType="integer")
    private Integer page = 1;

    @ApiModelProperty(name = "page",value = "每页数据大小:",required = true,dataType="integer")
    private Integer pageSize = 10;

    @ApiModelProperty(name = "queryAll",value = "是否查询所有数据，如果是，则忽略分页参数",required = true,dataType="integer")
    private Boolean queryAll = false;

    @ApiModelProperty(name = "orders",value = "要排序的字段",required = false)
    private List<Order> orders = Collections.emptyList();
    
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getQueryAll() {
        return queryAll;
    }

    public void setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
}
