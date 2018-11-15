package com.bea.dao;

import com.bea.olp.CFG_FLOW_WEIGHT;

public interface CFG_FLOW_WEIGHTMapper {
    int deleteByPrimaryKey(String flowType);

    int insert(CFG_FLOW_WEIGHT record);

    int insertSelective(CFG_FLOW_WEIGHT record);

    CFG_FLOW_WEIGHT selectByPrimaryKey(String flowType);

    int updateByPrimaryKeySelective(CFG_FLOW_WEIGHT record);

    int updateByPrimaryKey(CFG_FLOW_WEIGHT record);
}