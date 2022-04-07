package com.atguigu.gmail.gmailmanageservice.service.impl;

import com.atguigu.gmail.bean.PmsBaseCatalog1;
import com.atguigu.gmail.gmailmanageservice.mapper.PmsBaseCatalog1Mapper;
import com.atguigu.gmail.gmailmanageservice.mapper.PmsBaseCatalog2Mapper;
import com.atguigu.gmail.gmailmanageservice.mapper.PmsBaseCatalog3Mapper;
import com.atguigu.gmail.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CatalogServiceImpl implements CatalogService {
    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return null;
    }
}
