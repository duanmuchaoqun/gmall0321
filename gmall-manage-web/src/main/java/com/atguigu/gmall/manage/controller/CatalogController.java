package com.atguigu.gmall.manage.controller;

import bean.PmsBaseCatalog1;
import bean.PmsBaseCatalog2;
import bean.PmsBaseCatalog3;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CataLogService;

import java.util.List;

@CrossOrigin
@Controller
public class CatalogController {

    @Reference
    CataLogService cataLogService;

    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> catalog1List= cataLogService.getCatalog1();
        return catalog1List;
    }

    @RequestMapping("/getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2> catalog2List= cataLogService.getCatalog2(catalog1Id);
        return catalog2List;
    }

    @RequestMapping("/getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> catalog3List= cataLogService.getCatalog3(catalog2Id);
        return catalog3List;
    }

}
