package com.sunshine.webproject.domain.dto.response.results;

import com.sunshine.webproject.domain.dto.response.codes.HttpCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author sunshine
 * @date :2020/2/17 20:57
 * @description: 分页数据返回类
 */
@ApiModel("分页数据返回类")
public class PagingResult<T> extends MultipleResult<T>{

    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/

    @ApiModelProperty(name = "page",value = "页面号")
    private int page;

    @ApiModelProperty(name = "pageSize",value = "每页数据量")
    private int pageSize;

    @ApiModelProperty(name = "total",value = "总数据量")
    private int total;

    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/

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

    public static <T> PagingResult<T> success(List<T> list){
        PagingResult<T> pagingResult = new PagingResult<>();
        Results.useCode(pagingResult, HttpCode.OK);
        pagingResult.setData(list);

        return pagingResult;
    }
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
    public boolean completePageInfo(){
        return false;
    }
}
