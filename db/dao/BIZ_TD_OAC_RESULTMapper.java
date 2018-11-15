package com.bea.dao;

import com.bea.olp.BIZ_TD_OAC_RESULT;

public interface BIZ_TD_OAC_RESULTMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_TD_OAC_RESULT record);

    int insertSelective(BIZ_TD_OAC_RESULT record);

    BIZ_TD_OAC_RESULT selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_TD_OAC_RESULT record);

    int updateByPrimaryKey(BIZ_TD_OAC_RESULT record);
}