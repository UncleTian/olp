package com.bea.dao;

import com.bea.olp.CFG_BUSINESS_PAR;

public interface CFG_BUSINESS_PARMapper {
    int deleteByPrimaryKey(String serno);

    int insert(CFG_BUSINESS_PAR record);

    int insertSelective(CFG_BUSINESS_PAR record);

    CFG_BUSINESS_PAR selectByPrimaryKey(String serno);

    int updateByPrimaryKeySelective(CFG_BUSINESS_PAR record);

    int updateByPrimaryKey(CFG_BUSINESS_PAR record);
}