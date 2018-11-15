package com.bea.dao;

import com.bea.olp.SF_OPERATION;

public interface SF_OPERATIONMapper {
    int deleteByPrimaryKey(String operationId);

    int insert(SF_OPERATION record);

    int insertSelective(SF_OPERATION record);

    SF_OPERATION selectByPrimaryKey(String operationId);

    int updateByPrimaryKeySelective(SF_OPERATION record);

    int updateByPrimaryKey(SF_OPERATION record);
}