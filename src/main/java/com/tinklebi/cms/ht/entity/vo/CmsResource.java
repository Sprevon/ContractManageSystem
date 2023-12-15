package com.tinklebi.cms.ht.entity.vo;

import com.tinklebi.cms.ht.entity.UserInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

//import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/16 15:46
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CmsResource extends UserInfo implements Serializable {
//    @Serial
    private static final long serialVersionUID = -7025523858132844444L;

    /**
     * 资源编号
     */
    private Long resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源型号
     */
    private String resourceType;

    /**
     * 资源规格
     */
    private String resourceSpec;

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
