package com.bea.dao;

import com.bea.olp.RAT_APP_INFO_JD;

public interface RAT_APP_INFO_JDMapper {
    int deleteByPrimaryKey(String mhtApplyNo);

    int insert(RAT_APP_INFO_JD record);

    int insertSelective(RAT_APP_INFO_JD record);

    RAT_APP_INFO_JD selectByPrimaryKey(String mhtApplyNo);

    int updateByPrimaryKeySelective(RAT_APP_INFO_JD record);

    int updateByPrimaryKey(RAT_APP_INFO_JD record);
}