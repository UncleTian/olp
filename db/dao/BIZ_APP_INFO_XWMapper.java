package com.bea.dao;

import com.bea.olp.BIZ_APP_INFO_XW;

public interface BIZ_APP_INFO_XWMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_APP_INFO_XW record);

    int insertSelective(BIZ_APP_INFO_XW record);

    BIZ_APP_INFO_XW selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_APP_INFO_XW record);

    int updateByPrimaryKey(BIZ_APP_INFO_XW record);
}