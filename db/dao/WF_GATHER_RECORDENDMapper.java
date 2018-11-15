package com.bea.dao;

import com.bea.olp.WF_GATHER_RECORDEND;

public interface WF_GATHER_RECORDENDMapper {
    int deleteByPrimaryKey(String instanceid);

    int insert(WF_GATHER_RECORDEND record);

    int insertSelective(WF_GATHER_RECORDEND record);

    WF_GATHER_RECORDEND selectByPrimaryKey(String instanceid);

    int updateByPrimaryKeySelective(WF_GATHER_RECORDEND record);

    int updateByPrimaryKey(WF_GATHER_RECORDEND record);
}