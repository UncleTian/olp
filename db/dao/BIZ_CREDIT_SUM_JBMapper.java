package com.bea.dao;

import com.bea.olp.BIZ_CREDIT_SUM_JB;

public interface BIZ_CREDIT_SUM_JBMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_CREDIT_SUM_JB record);

    int insertSelective(BIZ_CREDIT_SUM_JB record);

    BIZ_CREDIT_SUM_JB selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_CREDIT_SUM_JB record);

    int updateByPrimaryKey(BIZ_CREDIT_SUM_JB record);
}