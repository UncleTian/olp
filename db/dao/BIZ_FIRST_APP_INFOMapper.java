package com.bea.dao;

import com.bea.olp.BIZ_FIRST_APP_INFO;

public interface BIZ_FIRST_APP_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_FIRST_APP_INFO record);

    int insertSelective(BIZ_FIRST_APP_INFO record);

    BIZ_FIRST_APP_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_FIRST_APP_INFO record);

    int updateByPrimaryKey(BIZ_FIRST_APP_INFO record);
}