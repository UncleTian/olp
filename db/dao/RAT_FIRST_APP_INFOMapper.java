package com.bea.dao;

import com.bea.olp.RAT_FIRST_APP_INFO;

public interface RAT_FIRST_APP_INFOMapper {
    int deleteByPrimaryKey(String tpNo);

    int insert(RAT_FIRST_APP_INFO record);

    int insertSelective(RAT_FIRST_APP_INFO record);

    RAT_FIRST_APP_INFO selectByPrimaryKey(String tpNo);

    int updateByPrimaryKeySelective(RAT_FIRST_APP_INFO record);

    int updateByPrimaryKey(RAT_FIRST_APP_INFO record);
}