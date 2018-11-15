package com.bea.dao;

import com.bea.olp.LOAN_APP_SUB_INFO;

public interface LOAN_APP_SUB_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(LOAN_APP_SUB_INFO record);

    int insertSelective(LOAN_APP_SUB_INFO record);

    LOAN_APP_SUB_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(LOAN_APP_SUB_INFO record);

    int updateByPrimaryKey(LOAN_APP_SUB_INFO record);
}