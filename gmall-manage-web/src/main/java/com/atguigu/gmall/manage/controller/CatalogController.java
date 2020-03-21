package com.atguigu.gmall.manage.controller;

import bean.PmsBaseCatalog1;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CataLogService;

import java.util.List;

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

}
