package com.bea.dao;

import com.bea.olp.PRT_USER_INFO_JD;

public interface PRT_USER_INFO_JDMapper {
    int deleteByPrimaryKey(String mhtApplyNo);

    int insert(PRT_USER_INFO_JD record);

    int insertSelective(PRT_USER_INFO_JD record);

    PRT_USER_INFO_JD selectByPrimaryKey(String mhtApplyNo);

    int updateByPrimaryKeySelective(PRT_USER_INFO_JD record);

    int updateByPrimaryKey(PRT_USER_INFO_JD record);
}