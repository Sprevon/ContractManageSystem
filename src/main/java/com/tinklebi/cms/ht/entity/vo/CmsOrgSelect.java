package com.tinklebi.cms.ht.entity.vo;

import com.tinklebi.cms.ht.entity.Pagination;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/23 15:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsOrgSelect extends Pagination implements Serializable {

//    @Serial
    private static final long serialVersionUID = 6385807603983867127L;

    /**
     * 单位名称，用于模糊搜索
     */
    private String orgName;

    /**
     * 单位编号
     */
    private Long orgId;

    public CmsOrgSelect(String orderOrgName) {
        this.orgName = orderOrgName;
    }


    public CmsOrgSelect(Long orderOrgId) {
        this.orgId = orderOrgId;
    }
}
