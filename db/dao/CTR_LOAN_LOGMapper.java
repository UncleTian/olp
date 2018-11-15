package com.bea.dao;

import com.bea.olp.CTR_LOAN_LOG;

public interface CTR_LOAN_LOGMapper {
    int deleteByPrimaryKey(String logSerno);

    int insert(CTR_LOAN_LOG record);

    int insertSelective(CTR_LOAN_LOG record);

    CTR_LOAN_LOG selectByPrimaryKey(String logSerno);

    int updateByPrimaryKeySelective(CTR_LOAN_LOG record);

    int updateByPrimaryKey(CTR_LOAN_LOG record);
}