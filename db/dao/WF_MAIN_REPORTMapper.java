package com.bea.dao;

import com.bea.olp.WF_MAIN_REPORT;

public interface WF_MAIN_REPORTMapper {
    int deleteByPrimaryKey(String instanceId);

    int insert(WF_MAIN_REPORT record);

    int insertSelective(WF_MAIN_REPORT record);

    WF_MAIN_REPORT selectByPrimaryKey(String instanceId);

    int updateByPrimaryKeySelective(WF_MAIN_REPORT record);

    int updateByPrimaryKey(WF_MAIN_REPORT record);
}