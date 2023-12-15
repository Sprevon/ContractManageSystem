package com.tinklebi.cms.ht.entity.po;

import com.tinklebi.cms.ht.entity.vo.CmsQuery;
import lombok.*;

//import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments 列表查询内容
 * @Author LeonBwChen
 * @Date 2023/10/23 10:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CmsQueryList extends CmsQuery implements Serializable {
//    @Serial
    private static final long serialVersionUID = 115853877768266850L;
    /**
     * 数量/吨
     */
    private double resourceQuality;

    /**
     * 价税合计
     */
    private double invoiceTotal;

    /**
     * 编辑状态
     */
    private String editType;

    /**
     * 交货时间
     */
    private String resourceDate;
}
