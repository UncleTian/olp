package com.bea.dao;

import com.bea.olp.BIZ_BR_APPLY_LOAN_STR;

public interface BIZ_BR_APPLY_LOAN_STRMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_BR_APPLY_LOAN_STR record);

    int insertSelective(BIZ_BR_APPLY_LOAN_STR record);

    BIZ_BR_APPLY_LOAN_STR selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_BR_APPLY_LOAN_STR record);

    int updateByPrimaryKey(BIZ_BR_APPLY_LOAN_STR record);
}