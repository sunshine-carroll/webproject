package com.sunshine.webproject.utils;

import com.github.pagehelper.PageHelper;
import com.sunshine.webproject.domain.dto.request.PagingQuery;
import com.sunshine.webproject.log.Logger;
import com.sunshine.webproject.log.LoggerFactory;

/**
 * @author: sunshine
 * @date: 2020/5/22 17:50
 */
public class PageUtil {
    //TODO - JavaDoc methods
    public static final Logger logger = LoggerFactory.getLogger(PageUtil.class);
    

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
    
    
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
    public static void startPage(PagingQuery query){
        if (query.getQueryAll()){
            query.setPageSize(0);
        }
        PageHelper.startPage(query.getPage(),query.getPageSize(),false,false,query.getQueryAll());
    }

    public void setPage(){

    }

    public void clear(){
        PageHelper.clearPage();
    }
}
