package com.bea.dao;

import com.bea.olp.BIZ_ANT_LOAN_DETAIL;

public interface BIZ_ANT_LOAN_DETAILMapper {
    int deleteByPrimaryKey(String contractNo);

    int insert(BIZ_ANT_LOAN_DETAIL record);

    int insertSelective(BIZ_ANT_LOAN_DETAIL record);

    BIZ_ANT_LOAN_DETAIL selectByPrimaryKey(String contractNo);

    int updateByPrimaryKeySelective(BIZ_ANT_LOAN_DETAIL record);

    int updateByPrimaryKey(BIZ_ANT_LOAN_DETAIL record);
}