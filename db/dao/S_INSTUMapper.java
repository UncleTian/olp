package com.bea.dao;

import com.bea.olp.S_INSTU;

public interface S_INSTUMapper {
    int deleteByPrimaryKey(String instuCde);

    int insert(S_INSTU record);

    int insertSelective(S_INSTU record);

    S_INSTU selectByPrimaryKey(String instuCde);

    int updateByPrimaryKeySelective(S_INSTU record);

    int updateByPrimaryKey(S_INSTU record);
}