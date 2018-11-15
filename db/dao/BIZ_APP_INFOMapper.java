package com.bea.dao;

import com.bea.olp.BIZ_APP_INFO;

public interface BIZ_APP_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_APP_INFO record);

    int insertSelective(BIZ_APP_INFO record);

    BIZ_APP_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_APP_INFO record);

    int updateByPrimaryKey(BIZ_APP_INFO record);
}