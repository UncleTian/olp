package com.bea.dao;

import com.bea.olp.WF_MAIN_RECORDEND;

public interface WF_MAIN_RECORDENDMapper {
    int deleteByPrimaryKey(String instanceid);

    int insert(WF_MAIN_RECORDEND record);

    int insertSelective(WF_MAIN_RECORDEND record);

    WF_MAIN_RECORDEND selectByPrimaryKey(String instanceid);

    int updateByPrimaryKeySelective(WF_MAIN_RECORDEND record);

    int updateByPrimaryKey(WF_MAIN_RECORDEND record);
}