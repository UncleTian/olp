package com.bea.dao;

import com.bea.olp.BIZ_BR_EXECUTION;

public interface BIZ_BR_EXECUTIONMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_BR_EXECUTION record);

    int insertSelective(BIZ_BR_EXECUTION record);

    BIZ_BR_EXECUTION selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_BR_EXECUTION record);

    int updateByPrimaryKey(BIZ_BR_EXECUTION record);
}