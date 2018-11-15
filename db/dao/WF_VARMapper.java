package com.bea.dao;

import com.bea.olp.WF_VAR;

public interface WF_VARMapper {
    int deleteByPrimaryKey(String varid);

    int insert(WF_VAR record);

    int insertSelective(WF_VAR record);

    WF_VAR selectByPrimaryKey(String varid);

    int updateByPrimaryKeySelective(WF_VAR record);

    int updateByPrimaryKey(WF_VAR record);
}