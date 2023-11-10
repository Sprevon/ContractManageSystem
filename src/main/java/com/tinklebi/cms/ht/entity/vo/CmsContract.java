package com.tinklebi.cms.ht.entity.vo;

import com.tinklebi.cms.ht.entity.UserInfo;
import com.tinklebi.cms.ht.entity.enums.EditType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments 合同列表查询对象
 * @Author LeonBwChen
 * @Date 2023/10/23 14:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CmsContract extends UserInfo implements Serializable, CmsContractInfo{
    @Serial
    private static final long serialVersionUID = 6591450317462978592L;

    /**
     * 合同编号
     */
    private Long contractId;

    /**
     * 进货单位编号
     */
    private Long orderOrgId;

    /**
     * 供货单位编号
     */
    private Long supplyOrgId;

    /**
     * 收货单位编号
     */
    private Long receiveOrgId;

    /**
     * 结算单位编号
     */
    private Long settleOrgId;

    /**
     * 资源编号
     */
    private Long resourceId;

    /**
     * 资源数量
     */
    private Double resourceQuality;

    /**
     * 资源到货时间
     */
    private String resourceDate;

    /**
     * 合同条款
     */
    private String contractTerm;

    /**
     * 创建人
     */
    private Long createPerson;

    /**
     * 创建人名称
     */
    private String createPersonName;

    /**
     * 创建时间
     */
    private String createDate;

    /**
     * 最后修改人
     */
    private Long lastModifyPerson;

    /**
     * 最后修改人名称
     */
    private String lastModifyPersonName;

    /**
     * 最后修改时间
     */
    private String lastModifyDate;

    /**
     * 修改状态
     */
    private String editType;
}
