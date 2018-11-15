package com.bea.dao;

import com.bea.olp.CREDIT_QUERY_JD;

public interface CREDIT_QUERY_JDMapper {
    int deleteByPrimaryKey(String logNo);

    int insert(CREDIT_QUERY_JD record);

    int insertSelective(CREDIT_QUERY_JD record);

    CREDIT_QUERY_JD selectByPrimaryKey(String logNo);

    int updateByPrimaryKeySelective(CREDIT_QUERY_JD record);

    int updateByPrimaryKeyWithBLOBs(CREDIT_QUERY_JD record);

    int updateByPrimaryKey(CREDIT_QUERY_JD record);
}