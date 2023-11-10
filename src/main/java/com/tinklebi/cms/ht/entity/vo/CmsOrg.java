package com.tinklebi.cms.ht.entity.vo;

import com.tinklebi.cms.ht.entity.UserInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments 合同单位查询对象&返回值对象
 * @Author LeonBwChen
 * @Date 2023/10/16 15:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CmsOrg extends UserInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 2478460524234881347L;

    /**
     * 单位编号
     */
    private Long orgId;

    /**
     * 单位名称
     */
    private String orgName;

    /**
     * 单位地址
     */
    private String orgAddress;

    /**
     * 单位电话
     */
    private Long orgPhone;

    /**
     * 单位传真
     */
    private Long orgFax;

    /**
     * 单位代表人编号
     */
    private Long orgRepresent;

    /**
     * 企业代表人名称
     */
    private String orgRepresentName;

    /**
     * 单位邮政编号
     */
    private Long orgMail;

    /**
     * 单位银行开户地址
     */
    private String orgBank;

    /**
     * 单位银行卡号
     */
    private Long orgBankAccount;

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
     * 最后修改时间
     */
    private String lastModifyDate;
}
