package com.bea.dao;

import com.bea.olp.BIZ_TD_RESULT_INFO;

public interface BIZ_TD_RESULT_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_TD_RESULT_INFO record);

    int insertSelective(BIZ_TD_RESULT_INFO record);

    BIZ_TD_RESULT_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_TD_RESULT_INFO record);

    int updateByPrimaryKey(BIZ_TD_RESULT_INFO record);
}