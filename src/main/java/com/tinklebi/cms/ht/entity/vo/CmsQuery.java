package com.tinklebi.cms.ht.entity.vo;

import com.tinklebi.cms.ht.entity.Pagination;
import com.tinklebi.cms.ht.entity.enums.EditType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/16 15:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CmsQuery extends Pagination implements Serializable {
    @Serial
    private static final long serialVersionUID = -7402356809707563645L;
    /**
     * 订单号
     */
    private Long contractId;

    /**
     * 单位名称
     */
    private String orgName;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源规格
     */
    private String resourceSpec;

    /**
     * 编辑状态
     */
    private List<String> editTypes;

    /**
     * 交货开始时间
     */
    private String resourceDateStart;

    /**
     * 交货结束日期
     */
    private String resourceDateEnd;

}
