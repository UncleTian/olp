package com.bea.dao;

import com.bea.olp.WF_GATHER_ACTION_RECORDEND;

public interface WF_GATHER_ACTION_RECORDENDMapper {
    int deleteByPrimaryKey(String actionid);

    int insert(WF_GATHER_ACTION_RECORDEND record);

    int insertSelective(WF_GATHER_ACTION_RECORDEND record);

    WF_GATHER_ACTION_RECORDEND selectByPrimaryKey(String actionid);

    int updateByPrimaryKeySelective(WF_GATHER_ACTION_RECORDEND record);

    int updateByPrimaryKey(WF_GATHER_ACTION_RECORDEND record);
}