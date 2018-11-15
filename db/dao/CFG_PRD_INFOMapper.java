package com.bea.dao;

import com.bea.olp.CFG_PRD_INFO;

public interface CFG_PRD_INFOMapper {
    int deleteByPrimaryKey(String prdCode);

    int insert(CFG_PRD_INFO record);

    int insertSelective(CFG_PRD_INFO record);

    CFG_PRD_INFO selectByPrimaryKey(String prdCode);

    int updateByPrimaryKeySelective(CFG_PRD_INFO record);

    int updateByPrimaryKey(CFG_PRD_INFO record);
}