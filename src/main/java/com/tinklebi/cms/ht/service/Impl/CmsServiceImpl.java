package com.tinklebi.cms.ht.service.Impl;

import com.tinklebi.cms.ht.dao.CmsMapper;
import com.tinklebi.cms.ht.entity.enums.EditType;
import com.tinklebi.cms.ht.entity.po.CmsDetailsResult;
import com.tinklebi.cms.ht.entity.po.CmsQueryList;
import com.tinklebi.cms.ht.entity.vo.CmsOrg;
import com.tinklebi.cms.ht.entity.vo.CmsResource;
import com.tinklebi.cms.ht.entity.vo.*;
import com.tinklebi.cms.utils.HTTPResult;
import com.tinklebi.cms.ht.service.CmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static com.tinklebi.cms.utils.Constants.CODE_SERVER_ERROR;

/**
 * @Comments 合同管理系统逻辑实现
 * @Author LeonBwChen
 * @Date 2023/10/16 15:22
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CmsServiceImpl implements CmsService {
    @Autowired
    private CmsMapper cmsMapper;
    /**
     * 查询合同列表
     *
     * @param cmsQuery
     * @return
     */
    @Override
    public HTTPResult queryCms(CmsQuery cmsQuery) {
        cmsQuery.setStartAndLimit();
        ArrayList<CmsQueryList> result = cmsMapper.selectCmsList(cmsQuery);
        int count = cmsMapper.selectCmsListCount(cmsQuery);
        return HTTPResult.buildSuccess(count, result);
    }

    /**
     * 查询合同详细
     *
     * @param cmsDetails
     * @return
     */
    @Override
    public HTTPResult queryCmsDetail(CmsDetails cmsDetails) {
        CmsDetailsResult result = cmsMapper.selectCmsDetail(cmsDetails);
        CmsOrg orderOrg = cmsMapper.selectOrg(new CmsOrgSelect(result.getOrderOrgId()));
        CmsOrg supplyOrg = cmsMapper.selectOrg(new CmsOrgSelect(result.getSupplyOrgId()));
        CmsOrg receiveOrg = cmsMapper.selectOrg(new CmsOrgSelect(result.getReceiveOrgId()));
        CmsOrg settleOrg = cmsMapper.selectOrg(new CmsOrgSelect(result.getSettleOrgId()));
        CmsResource resource = cmsMapper.selectResource(new CmsResourceSelect(result.getResourceId()));
        result.setOrderOrg(orderOrg);
        result.setSupplyOrg(supplyOrg);
        result.setReceiveOrg(receiveOrg);
        result.setSettleOrg(settleOrg);
        result.setResource(resource);
        return HTTPResult.buildSuccess(result);
    }

    /**
     * 删除合同
     *
     * @param cmsDetails
     * @return
     */
    @Override
    public HTTPResult deleteCms(CmsDetails cmsDetails) {
        HTTPResult existJudge = queryExist(cmsDetails);
        if (CODE_SERVER_ERROR != existJudge.getCode()) {
            cmsMapper.deleteCms(cmsDetails);
        }
        return existJudge;
    }


    @Override
    public HTTPResult queryExist(CmsDetails cmsDetails) {
        if (!checkExist(cmsDetails)){
            return HTTPResult.buildFault("当前合同不存在");
        }else {
            return HTTPResult.buildSuccess();
        }
    }

    /**
     * 创建合同
     *
     * @param cmsContract
     * @return
     */
    @Override
    public HTTPResult createCms(CmsContract cmsContract) {
        cmsContract.setEditType("1");
        cmsMapper.insertCms(cmsContract);
        cmsMapper.insertCmsDelete(cmsContract);
        return HTTPResult.buildSuccess();
    }

    /**
     * 创建合同对应的发票
     *
     * @param cmsInvoice
     * @return
     */
    @Override
    public HTTPResult createInvoice(CmsInvoice cmsInvoice) {
        cmsMapper.insertInvoice(cmsInvoice);
        return HTTPResult.buildSuccess();
    }

    /**
     * 编辑合同（高级别用户可用审核）
     *
     * @param cmsContract
     * @return
     */
    @Override
    public HTTPResult editCms(CmsContract cmsContract) {
        if (checkExist(cmsContract)){
            cmsMapper.updateCms(cmsContract);
            return HTTPResult.buildSuccess();
        }else {
            return HTTPResult.buildFault("合同不存在!");
        }
    }

    /**
     * 通过合同
     *
     * @param cmsContract
     * @return
     */
    @Override
    public HTTPResult passCms(CmsContract cmsContract) {
        cmsMapper.updateCmsPass(cmsContract);
        return HTTPResult.buildSuccess();
    }

    /**
     * 拒绝合同
     *
     * @param cmsContract
     * @return
     */
    @Override
    public HTTPResult rejectCms(CmsContract cmsContract) {
        cmsMapper.updateCmsReject(cmsContract);
        return HTTPResult.buildSuccess();
    }

    /**
     * 编辑发票
     * @param cmsInvoice
     * @return
     */
    @Override
    public HTTPResult editInvoice(CmsInvoice cmsInvoice) {
        if (checkExist(cmsInvoice)){
            cmsMapper.updateInvoice(cmsInvoice);
            return HTTPResult.buildSuccess();
        }else {
            return HTTPResult.buildFault("合同不存在!");
        }
    }

    /**
     * 创建关联企业
     *
     * @param cmsOrg
     * @return
     */
    @Override
    public HTTPResult createOrg(CmsOrg cmsOrg) {
        cmsMapper.insertOrg(cmsOrg);
        return HTTPResult.buildSuccess();
    }

    /**
     * 创建相关资源
     *
     * @param cmsResource
     * @return
     */
    @Override
    public HTTPResult createResource(CmsResource cmsResource) {
        cmsMapper.insertResource(cmsResource);
        return HTTPResult.buildSuccess();
    }

    /**
     * 创建、修改合同中，查询单位信息
     *
     * @param cmsOrgSelect
     * @return
     */
    @Override
    public HTTPResult queryOrg(CmsOrgSelect cmsOrgSelect) {
        cmsOrgSelect.setStartAndLimit();
        List<CmsOrg> cmsOrgList = cmsMapper.selectOrgList(cmsOrgSelect);
        int total = cmsMapper.selectOrgListTotal(cmsOrgSelect);
        return HTTPResult.buildSuccess(total, cmsOrgList);
    }

    /**
     * 查询单位详细信息
     *
     * @param cmsOrgSelect
     * @return
     */
    @Override
    public HTTPResult queryOrgDetail(CmsOrgSelect cmsOrgSelect) {
        CmsOrg cmsOrg = cmsMapper.selectOrg(cmsOrgSelect);
        return HTTPResult.buildSuccess(cmsOrg);
    }

    /**
     * 创建、修改合同中，查询资源信息
     *
     * @param cmsResourceSelect
     * @return
     */
    @Override
    public HTTPResult queryResource(CmsResourceSelect cmsResourceSelect) {
        List<CmsResource> cmsResourceList = cmsMapper.selectResourceList(cmsResourceSelect);
        return HTTPResult.buildSuccess(cmsResourceList);
    }

    /**
     * 查询资源单个信息
     *
     * @param cmsResourceSelect
     * @return
     */
    @Override
    public HTTPResult queryResourceDetail(CmsResourceSelect cmsResourceSelect) {
        CmsResource cmsResource = cmsMapper.selectResource(cmsResourceSelect);
        return HTTPResult.buildSuccess(cmsResource);
    }

    /**
     * 检查是否存在
     * @param contractInfo
     * @return
     */
    private boolean checkExist(CmsContractInfo contractInfo){
        CmsDetailsResult result = cmsMapper.selectCmsDetail(new CmsDetails(contractInfo.getContractId()));
        return result != null;
    }
}
