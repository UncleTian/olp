package com.bea.dao;

import com.bea.olp.BIZ_XW_LOAN_INFO;

public interface BIZ_XW_LOAN_INFOMapper {
    int deleteByPrimaryKey(String loanNo);

    int insert(BIZ_XW_LOAN_INFO record);

    int insertSelective(BIZ_XW_LOAN_INFO record);

    BIZ_XW_LOAN_INFO selectByPrimaryKey(String loanNo);

    int updateByPrimaryKeySelective(BIZ_XW_LOAN_INFO record);

    int updateByPrimaryKey(BIZ_XW_LOAN_INFO record);
}