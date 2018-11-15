package com.bea.dao;

import com.bea.olp.BIZ_APP_INFO_JD;

public interface BIZ_APP_INFO_JDMapper {
    int deleteByPrimaryKey(String mhtApplyNo);

    int insert(BIZ_APP_INFO_JD record);

    int insertSelective(BIZ_APP_INFO_JD record);

    BIZ_APP_INFO_JD selectByPrimaryKey(String mhtApplyNo);

    int updateByPrimaryKeySelective(BIZ_APP_INFO_JD record);

    int updateByPrimaryKey(BIZ_APP_INFO_JD record);
}