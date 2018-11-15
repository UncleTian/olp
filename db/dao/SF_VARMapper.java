package com.bea.dao;

import com.bea.olp.SF_VAR;

public interface SF_VARMapper {
    int deleteByPrimaryKey(String varId);

    int insert(SF_VAR record);

    int insertSelective(SF_VAR record);

    SF_VAR selectByPrimaryKey(String varId);

    int updateByPrimaryKeySelective(SF_VAR record);

    int updateByPrimaryKey(SF_VAR record);
}