package com.tinklebi.cms.ht.entity;

import lombok.Data;

/**
 * @Comments 分页查询工具
 * @Author LeonBwChen
 * @Date 2023/10/23 10:29
 */
@Data
public class Pagination {
    /**
     * 页面编号
     */
    private int pageNo;

    /**
     * 单页数据量
     */
    private int pageSize;

    /**
     * 开始
     */
    private int start;

    /**
     * 数量
     */
    private int limit;

    public void setStartAndLimit(){
        if (pageSize * pageNo != 0){
            start = (pageNo - 1) * pageSize;
            limit = pageSize;
        }
    }
}
