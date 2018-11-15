package com.bea.dao;

import com.bea.olp.BIZ_ANT_LOAN_INIT;

public interface BIZ_ANT_LOAN_INITMapper {
    int deleteByPrimaryKey(String contractNo);

    int insert(BIZ_ANT_LOAN_INIT record);

    int insertSelective(BIZ_ANT_LOAN_INIT record);

    BIZ_ANT_LOAN_INIT selectByPrimaryKey(String contractNo);

    int updateByPrimaryKeySelective(BIZ_ANT_LOAN_INIT record);

    int updateByPrimaryKey(BIZ_ANT_LOAN_INIT record);
}