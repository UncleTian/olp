package com.bea.dao;

import com.bea.olp.PRT_BASICINFO_XW;

public interface PRT_BASICINFO_XWMapper {
    int deleteByPrimaryKey(String appId);

    int insert(PRT_BASICINFO_XW record);

    int insertSelective(PRT_BASICINFO_XW record);

    PRT_BASICINFO_XW selectByPrimaryKey(String appId);

    int updateByPrimaryKeySelective(PRT_BASICINFO_XW record);

    int updateByPrimaryKey(PRT_BASICINFO_XW record);
}