package com.tinklebi.cms.ht.entity.po;

import com.tinklebi.cms.ht.entity.vo.CmsOrg;
import com.tinklebi.cms.ht.entity.vo.CmsResource;
import lombok.Data;

//import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments 详细查询内容.CmsOrg不为首次查询内容
 * @Author LeonBwChen
 * @Date 2023/10/23 10:30
 */
@Data
public class CmsDetailsResult implements Serializable {
//    @Serial
    private static final long serialVersionUID = 1001258325591298919L;

    //合同部分

    /**
     * 订单号
     */
    private Long contractId;

    /**
     * 订单描述
     */
    private String contractTerm;

    /**
     * 订货单位编号
     */
    private Long orderOrgId;

    /**
     * 订货单位名称
     */
    private String orderOrgName;

    /**
     * 订货单位信息
     */
    private CmsOrg orderOrg;

    /**
     * 供货单位编号
     */
    private Long supplyOrgId;

    /**
     * 供货单位名称
     */
    private String supplyOrgName;

    /**
     * 供货单位信息
     */
    private CmsOrg supplyOrg;

    /**
     * 收货单位编号
     */
    private Long receiveOrgId;

    /**
     * 收货单位名称
     */
    private String receiveOrgName;

    /**
     * 收货单位信息
     */
    private CmsOrg receiveOrg;

    /**
     * 结算单位编号
     */
    private Long settleOrgId;

    /**
     * 结算单位名称
     */
    private String settleOrgName;

    /**
     * 结算单位信息
     */
    private CmsOrg settleOrg;

    /**
     * 资源编号
     */
    private Long resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源数量
     */
    private Double resourceQuality;

    /**
     * 获取时间
     */
    private String resourceDate;

    /**
     * 资源信息
     */
    private CmsResource resource;

    //发票部分
    /**
     * 发票单号
     */
    private Long invoiceId;

    /**
     * 单价
     */
    private Double invoiceUnitPrice;

    /**
     * 金额
     */
    private Double invoicePrice;

    /**
     * 税额
     */
    private Double invoiceTax;

    /**
     * 税率
     */
    private Double invoiceTaxPercent;

    /**
     * 价税合计
     */
    private Double invoiceTotal;
}
