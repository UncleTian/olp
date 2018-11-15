package com.bea.dao;

import com.bea.olp.LOAN_CONT_INFO;

public interface LOAN_CONT_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(LOAN_CONT_INFO record);

    int insertSelective(LOAN_CONT_INFO record);

    LOAN_CONT_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(LOAN_CONT_INFO record);

    int updateByPrimaryKey(LOAN_CONT_INFO record);
}