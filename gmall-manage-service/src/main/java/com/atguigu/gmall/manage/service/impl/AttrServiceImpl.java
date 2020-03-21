package com.atguigu.gmall.manage.service.impl;

import bean.PmsBaseAttrInfo;
import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.manage.mapper.AttrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.AttrService;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    AttrMapper attrMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        return attrMapper.select(pmsBaseAttrInfo);
    }
}
