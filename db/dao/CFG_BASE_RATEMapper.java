package com.bea.dao;

import com.bea.olp.CFG_BASE_RATE;

public interface CFG_BASE_RATEMapper {
    int deleteByPrimaryKey(String rptPk);

    int insert(CFG_BASE_RATE record);

    int insertSelective(CFG_BASE_RATE record);

    CFG_BASE_RATE selectByPrimaryKey(String rptPk);

    int updateByPrimaryKeySelective(CFG_BASE_RATE record);

    int updateByPrimaryKey(CFG_BASE_RATE record);
}