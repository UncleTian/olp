package com.bea.dao;

import com.bea.olp.WF_GATHER_ACTION_RECORD;

public interface WF_GATHER_ACTION_RECORDMapper {
    int deleteByPrimaryKey(String actionid);

    int insert(WF_GATHER_ACTION_RECORD record);

    int insertSelective(WF_GATHER_ACTION_RECORD record);

    WF_GATHER_ACTION_RECORD selectByPrimaryKey(String actionid);

    int updateByPrimaryKeySelective(WF_GATHER_ACTION_RECORD record);

    int updateByPrimaryKey(WF_GATHER_ACTION_RECORD record);
}