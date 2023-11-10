package com.tinklebi.cms.ht.entity.vo;

import com.fasterxml.jackson.databind.node.DoubleNode;
import com.tinklebi.cms.ht.entity.UserInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments 合同发票查询对象
 * @Author LeonBwChen
 * @Date 2023/10/16 15:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CmsInvoice extends UserInfo implements Serializable, CmsContractInfo {
    @Serial
    private static final long serialVersionUID = 3647868483940117633L;

    /**
     * 发票编号
     */
    private Long invoiceId;

    /**
     * 合同编号
     */
    private Long contractId;

    /**
     * 货物数量
     */
    private Double invoiceQuantity;

    /**
     * 单价
     */
    private Double invoiceUnitPrice;

    /**
     * 金额
     */
    private Double invoicePrice;

    /**
     * 税率
     */
    private Double invoiceTaxPercent;

    /**
     * 税额
     */
    private Double invoiceTax;

    /**
     * 价税总计
     */
    private Double invoiceTotal;

    /**
     * 创建人
     */
    private Long createPerson;

    /**
     * 创建时间
     */
    private String createDate;

    /**
     * 最后修改人
     */
    private Long lastModifyPerson;

    /**
     * 最后修改日期
     */
    private String lastModifyDate;
}
