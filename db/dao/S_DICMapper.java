package com.bea.dao;

import com.bea.olp.S_DIC;

public interface S_DICMapper {
    int deleteByPrimaryKey(String dicpk);

    int insert(S_DIC record);

    int insertSelective(S_DIC record);

    S_DIC selectByPrimaryKey(String dicpk);

    int updateByPrimaryKeySelective(S_DIC record);

    int updateByPrimaryKey(S_DIC record);
}