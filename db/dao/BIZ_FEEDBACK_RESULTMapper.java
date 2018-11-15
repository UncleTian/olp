package com.bea.dao;

import com.bea.olp.BIZ_FEEDBACK_RESULT;

public interface BIZ_FEEDBACK_RESULTMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_FEEDBACK_RESULT record);

    int insertSelective(BIZ_FEEDBACK_RESULT record);

    BIZ_FEEDBACK_RESULT selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_FEEDBACK_RESULT record);

    int updateByPrimaryKey(BIZ_FEEDBACK_RESULT record);
}