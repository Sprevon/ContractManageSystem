package com.tinklebi.cms.ht.controller;

import com.tinklebi.cms.ht.entity.vo.CmsOrg;
import com.tinklebi.cms.ht.entity.vo.CmsResource;
import com.tinklebi.cms.ht.entity.vo.*;
import com.tinklebi.cms.utils.HTTPResult;
import com.tinklebi.cms.ht.service.CmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Comments 合同管理系统对外开放接口
 * @Author LeonBwChen
 * @Date 2023/10/16 15:23
 */
@Controller
@RequestMapping("/cms")
public class CmsController {
    @Autowired
    private CmsService service;

    /**
     * 查询合同信息
     * @param cmsQuery
     * @return
     */
    @RequestMapping(value = "/queryCms", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult queryCms(@RequestBody CmsQuery cmsQuery){
        return service.queryCms(cmsQuery);
    }

    /**
     * 查询合同详细内容
     * @param cmsDetails
     * @return
     */
    @RequestMapping(value = "/queryCmsDetails", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult queryCmsDetails(@RequestBody CmsDetails cmsDetails){
        return service.queryCmsDetail(cmsDetails);
    }

    /**
     * 删除合同
     * @param cmsDetails
     * @return
     */
    @RequestMapping(value = "/deleteCms", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult deleteCms(HttpServletRequest request, @RequestBody CmsDetails cmsDetails){
        cmsDetails.setUserId(request);
        return service.deleteCms(cmsDetails);
    }

    /**
     * 查询是否存在
     * @param cmsDetails
     * @return
     */
    @RequestMapping(value = "/queryExist", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult queryExist(@RequestBody CmsDetails cmsDetails){
        return service.queryExist(cmsDetails);
    }


    /**
     * 新建合同
     * @param request
     * @param cmsContract
     * @return
     */
    @RequestMapping(value = "/createCms", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult createCms(HttpServletRequest request, @RequestBody CmsContract cmsContract){
        cmsContract.setUserId(request);
        return service.createCms(cmsContract);
    }

    /**
     * 创建合同明细
     * @param cmsInvoice
     * @return
     */
    @RequestMapping(value = "/createInvoice", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult createInvoice(HttpServletRequest request, @RequestBody CmsInvoice cmsInvoice){
        cmsInvoice.setUserId(request);
        return service.createInvoice(cmsInvoice);
    }

    /**
     * 修改合同
     * @param request
     * @param cmsContract
     * @return
     */
    @RequestMapping(value = "/editCms", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult editCms(HttpServletRequest request, @RequestBody CmsContract cmsContract){
        cmsContract.setUserId(request);
        return service.editCms(cmsContract);
    }

    /**
     * 通过合同
     * @param request
     * @param cmsContract
     * @return
     */
    @RequestMapping(value = "/passCms", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult passCms(HttpServletRequest request, @RequestBody CmsContract cmsContract){
        cmsContract.setUserId(request);
        return service.passCms(cmsContract);
    }

    /**
     * 拒绝合同
     * @param request
     * @param cmsContract
     * @return
     */
    @RequestMapping(value = "/rejectCms", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult rejectCms(HttpServletRequest request, @RequestBody CmsContract cmsContract){
        cmsContract.setUserId(request);
        return service.rejectCms(cmsContract);
    }

    /**
     * 编辑发票
     * @param request
     * @param cmsInvoice
     * @return
     */
    @RequestMapping(value = "/editInvoice", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult editInvoice(HttpServletRequest request, @RequestBody CmsInvoice cmsInvoice){
        cmsInvoice.setUserId(request);
        return service.editInvoice(cmsInvoice);
    }

    /**
     * 创建新合作企业信息
     * @param cmsOrg
     * @return
     */
    @RequestMapping(value = "/createOrg", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult createOrg(HttpServletRequest request, @RequestBody CmsOrg cmsOrg){
        cmsOrg.setUserId(request);
        return service.createOrg(cmsOrg);
    }

    /**
     * 创建资源信息
     * @param cmsResource
     * @return
     */
    @RequestMapping(value = "/createResource", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult createResource(HttpServletRequest request, @RequestBody CmsResource cmsResource){
        cmsResource.setUserId(request);
        return service.createResource(cmsResource);
    }

    /**
     * 填写表单时查询单位信息
     * @param cmsOrgSelect
     * @return
     */
    @RequestMapping(value = "/queryOrg", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult queryOrg(@RequestBody CmsOrgSelect cmsOrgSelect){
        return service.queryOrg(cmsOrgSelect);
    }

    /**
     * 插叙单位详细信息
     * @param cmsOrgSelect
     * @return
     */
    @RequestMapping(value = "/queryOrgDetail", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult queryOrgDetail(@RequestBody CmsOrgSelect cmsOrgSelect){
        return service.queryOrgDetail(cmsOrgSelect);
    }


    /**
     * 查询资源信息
     * @param cmsResourceSelect
     * @return
     */
    @RequestMapping(value = "/queryResource", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult queryResource(@RequestBody CmsResourceSelect cmsResourceSelect){
        return service.queryResource(cmsResourceSelect);
    }

    /**
     * 查询单个资源信息
     * @param cmsResourceSelect
     * @return
     */
    @RequestMapping(value = "/queryResourceDetail", method = {RequestMethod.POST})
    @ResponseBody
    public HTTPResult queryResourceDetail(@RequestBody CmsResourceSelect cmsResourceSelect){
        return service.queryResourceDetail(cmsResourceSelect);
    }
}
