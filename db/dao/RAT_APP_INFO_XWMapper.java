package com.bea.dao;

import com.bea.olp.RAT_APP_INFO_XW;

public interface RAT_APP_INFO_XWMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(RAT_APP_INFO_XW record);

    int insertSelective(RAT_APP_INFO_XW record);

    RAT_APP_INFO_XW selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(RAT_APP_INFO_XW record);

    int updateByPrimaryKey(RAT_APP_INFO_XW record);
}