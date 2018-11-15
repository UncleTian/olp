package com.bea.dao;

import com.bea.olp.CFG_CALLBACK_ADDR;

public interface CFG_CALLBACK_ADDRMapper {
    int deleteByPrimaryKey(String prdCode);

    int insert(CFG_CALLBACK_ADDR record);

    int insertSelective(CFG_CALLBACK_ADDR record);

    CFG_CALLBACK_ADDR selectByPrimaryKey(String prdCode);

    int updateByPrimaryKeySelective(CFG_CALLBACK_ADDR record);

    int updateByPrimaryKey(CFG_CALLBACK_ADDR record);
}