package com.tinklebi.cms.ht.dao;

import com.tinklebi.cms.ht.entity.vo.CmsOrg;
import com.tinklebi.cms.ht.entity.po.CmsQueryList;
import com.tinklebi.cms.ht.entity.po.CmsDetailsResult;
import com.tinklebi.cms.ht.entity.vo.CmsResource;
import com.tinklebi.cms.ht.entity.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * @Comments 合同管理系统数据库映射
 * @Author LeonBwChen
 * @Date 2023/10/16 15:17
 */
@Mapper
public interface CmsMapper {
    /**
     * 查询合同订单列表
     * @param cmsQuery
     * @return
     */
    ArrayList<CmsQueryList> selectCmsList(CmsQuery cmsQuery);

    /**
     * 计算列表数量
     * @param cmsQuery
     * @return
     */
    int selectCmsListCount(CmsQuery cmsQuery);


    /**
     * 查询合同订单信息
     * @param cmsDetails
     * @return
     */
    CmsDetailsResult selectCmsDetail(CmsDetails cmsDetails);

    /**
     * 删除合同信息
     * @param cmsDetails
     */
    void deleteCms(CmsDetails cmsDetails);

    /**
     * 查询是否存在
     * @param cmsDetails
     * @return
     */
    CmsDetailsResult selectIfExist(CmsDetails cmsDetails);

    /**
     * 创建合同
     * @param cmsContract
     */
    void insertCms(CmsContract cmsContract);

    /**
     * 创建合同删除情况
     * @param cmsContract
     */
    void insertCmsDelete(CmsContract cmsContract);

    /**
     * 创建明细
     * @param cmsInvoice
     */
    void insertInvoice(CmsInvoice cmsInvoice);

    /**
     * 修改合同
     * @param cmsContract
     */
    void updateCms(CmsContract cmsContract);

    /**
     * 通过合同
     * @param cmsContract
     */
    void updateCmsPass(CmsContract cmsContract);

    /**
     * 拒绝合同
     * @param cmsContract
     */
    void updateCmsReject(CmsContract cmsContract);

    /**
     * 修改明细
     * @param cmsInvoice
     */
    void updateInvoice(CmsInvoice cmsInvoice);

    /**
     * 创建单位信息
     * @param cmsOrg
     */
    void insertOrg(CmsOrg cmsOrg);

    /**
     * 创建资源信息
     * @param cmsResource
     */
    void insertResource(CmsResource cmsResource);

    /**
     * 根据Id搜索企业
     * @param cmsOrgSelect
     * @return
     */
    CmsOrg selectOrg(CmsOrgSelect cmsOrgSelect);

    /**
     * 根据Id搜索资源信息
     * @param cmsResourceSelect
     * @return
     */
    CmsResource selectResource(CmsResourceSelect cmsResourceSelect);

    /**
     * 模糊查询返回企业信息数据集
     * @param cmsOrgSelect
     * @return
     */
    List<CmsOrg> selectOrgList(CmsOrgSelect cmsOrgSelect);

    /**
     * 查询企业信息数量统计
     * @param cmsOrgSelect
     * @return
     */
    int selectOrgListTotal(CmsOrgSelect cmsOrgSelect);

    /**
     * 模糊查询返回资源信息集合
     * @param cmsResourceSelect
     * @return
     */
    List<CmsResource> selectResourceList(CmsResourceSelect cmsResourceSelect);



    int selectOne();
}
