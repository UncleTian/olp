package com.bea.dao;

import com.bea.olp.S_RESC;

public interface S_RESCMapper {
    int deleteByPrimaryKey(String rescCde);

    int insert(S_RESC record);

    int insertSelective(S_RESC record);

    S_RESC selectByPrimaryKey(String rescCde);

    int updateByPrimaryKeySelective(S_RESC record);

    int updateByPrimaryKey(S_RESC record);
}