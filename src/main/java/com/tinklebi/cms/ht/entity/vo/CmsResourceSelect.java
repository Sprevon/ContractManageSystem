package com.tinklebi.cms.ht.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/23 15:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsResourceSelect implements Serializable {
    @Serial
    private static final long serialVersionUID = 1129942054520445720L;

    /**
     * 资源名称，用于模糊搜索
     */
    private String resourceName;

    /**
     * 资源编号
     */
    private Long resourceId;

    public CmsResourceSelect(Long resourceId) {
        this.resourceId = resourceId;
    }

    public CmsResourceSelect(String resourceName) {
        this.resourceName = resourceName;
    }
}
