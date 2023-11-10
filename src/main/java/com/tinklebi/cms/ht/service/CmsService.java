package com.tinklebi.cms.ht.service;

import com.tinklebi.cms.ht.entity.vo.CmsOrg;
import com.tinklebi.cms.ht.entity.vo.CmsResource;
import com.tinklebi.cms.ht.entity.vo.*;
import com.tinklebi.cms.utils.HTTPResult;

/**
 * @Comments 合同管理系统Service
 * @Author LeonBwChen
 * @Date 2023/10/16 15:22
 */
public interface CmsService {
    /**
     * 查询合同列表
     * @param cmsQuery
     * @return
     */
    HTTPResult queryCms(CmsQuery cmsQuery);

    /**
     * 查询合同详细
     * @param cmsDetails
     * @return
     */
    HTTPResult queryCmsDetail(CmsDetails cmsDetails);

    /**
     * 删除合同
     * @param cmsDetails
     * @return
     */
    HTTPResult deleteCms(CmsDetails cmsDetails);

    /**
     * 查询是否存在此合同
     * @param cmsDetails
     * @return
     */
    HTTPResult queryExist(CmsDetails cmsDetails);

    /**
     * 创建合同
     * @param cmsContract
     * @return
     */
    HTTPResult createCms(CmsContract cmsContract);

    /**
     * 创建合同对应的发票
     * @param cmsInvoice
     * @return
     */
    HTTPResult createInvoice(CmsInvoice cmsInvoice);

    /**
     * 编辑合同（高级别用户可用审核）
     * @param cmsContract
     * @return
     */
    HTTPResult editCms(CmsContract cmsContract);

    /**
     * 编辑发票
     * @param cmsInvoice
     * @return
     */
    HTTPResult editInvoice(CmsInvoice cmsInvoice);

    /**
     * 创建关联企业
     * @param cmsOrg
     * @return
     */
    HTTPResult createOrg(CmsOrg cmsOrg);

    /**
     * 创建相关资源
     * @param cmsResource
     * @return
     */
    HTTPResult createResource(CmsResource cmsResource);

    /**
     * 查询单位信息列表
     * @param cmsOrgSelect
     * @return
     */
    HTTPResult queryOrg(CmsOrgSelect cmsOrgSelect);

    /**
     * 查询单位详细信息
     * @param cmsOrgSelect
     * @return
     */
    HTTPResult queryOrgDetail(CmsOrgSelect cmsOrgSelect);

    /**
     * 查询资源信息
     * @param cmsResourceSelect
     * @return
     */
    HTTPResult queryResource(CmsResourceSelect cmsResourceSelect);

    /**
     * 查询资源单个信息
     * @param cmsResourceSelect
     * @return
     */
    HTTPResult queryResourceDetail(CmsResourceSelect cmsResourceSelect);

}
