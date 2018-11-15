package com.bea.dao;

import com.bea.olp.BIZ_ANT_LOAN_CALC;

public interface BIZ_ANT_LOAN_CALCMapper {
    int deleteByPrimaryKey(String contractNo);

    int insert(BIZ_ANT_LOAN_CALC record);

    int insertSelective(BIZ_ANT_LOAN_CALC record);

    BIZ_ANT_LOAN_CALC selectByPrimaryKey(String contractNo);

    int updateByPrimaryKeySelective(BIZ_ANT_LOAN_CALC record);

    int updateByPrimaryKey(BIZ_ANT_LOAN_CALC record);
}