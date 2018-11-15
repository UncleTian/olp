package com.bea.dao;

import com.bea.olp.PRT_LOAN_INFO;

public interface PRT_LOAN_INFOMapper {
    int insert(PRT_LOAN_INFO record);

    int insertSelective(PRT_LOAN_INFO record);
}