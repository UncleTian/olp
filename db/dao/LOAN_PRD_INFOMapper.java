package com.bea.dao;

import com.bea.olp.LOAN_PRD_INFO;

public interface LOAN_PRD_INFOMapper {
    int deleteByPrimaryKey(String loanNo);

    int insert(LOAN_PRD_INFO record);

    int insertSelective(LOAN_PRD_INFO record);

    LOAN_PRD_INFO selectByPrimaryKey(String loanNo);

    int updateByPrimaryKeySelective(LOAN_PRD_INFO record);

    int updateByPrimaryKey(LOAN_PRD_INFO record);
}