package com.tinklebi.cms.ht.entity.vo;

import com.tinklebi.cms.ht.entity.UserInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

//import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments 合同详细查询对象
 * @Author LeonBwChen
 * @Date 2023/10/16 15:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CmsDetails extends UserInfo implements Serializable, CmsContractInfo {
//    @Serial
    private static final long serialVersionUID = -6816505595587622174L;

    /**
     * 合同单号
     */
    private Long contractId;

    public CmsDetails() {    }

    public CmsDetails(Long contractId) {
        this.contractId = contractId;
    }
}
