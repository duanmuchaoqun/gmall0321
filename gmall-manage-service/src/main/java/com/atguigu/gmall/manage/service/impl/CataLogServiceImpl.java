package com.atguigu.gmall.manage.service.impl;

import bean.PmsBaseCatalog1;
import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.manage.mapper.CataLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.CataLogService;

import java.util.List;

@Service
public class CataLogServiceImpl implements CataLogService {

    @Autowired
    CataLogMapper cataLogMapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return cataLogMapper.selectAll();
    }
}
