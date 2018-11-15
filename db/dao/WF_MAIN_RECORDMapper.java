package com.bea.dao;

import com.bea.olp.WF_MAIN_RECORD;

public interface WF_MAIN_RECORDMapper {
    int deleteByPrimaryKey(String instanceid);

    int insert(WF_MAIN_RECORD record);

    int insertSelective(WF_MAIN_RECORD record);

    WF_MAIN_RECORD selectByPrimaryKey(String instanceid);

    int updateByPrimaryKeySelective(WF_MAIN_RECORD record);

    int updateByPrimaryKey(WF_MAIN_RECORD record);
}