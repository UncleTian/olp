package com.bea.dao;

import com.bea.olp.CFG_MCC_ACCESS;

public interface CFG_MCC_ACCESSMapper {
    int deleteByPrimaryKey(String mccCode);

    int insert(CFG_MCC_ACCESS record);

    int insertSelective(CFG_MCC_ACCESS record);

    CFG_MCC_ACCESS selectByPrimaryKey(String mccCode);

    int updateByPrimaryKeySelective(CFG_MCC_ACCESS record);

    int updateByPrimaryKey(CFG_MCC_ACCESS record);
}