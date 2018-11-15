package com.bea.dao;

import com.bea.olp.BIZ_TD_OAC_RESULT_DET;

public interface BIZ_TD_OAC_RESULT_DETMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_TD_OAC_RESULT_DET record);

    int insertSelective(BIZ_TD_OAC_RESULT_DET record);

    BIZ_TD_OAC_RESULT_DET selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_TD_OAC_RESULT_DET record);

    int updateByPrimaryKey(BIZ_TD_OAC_RESULT_DET record);
}