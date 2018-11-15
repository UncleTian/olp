package com.bea.dao;

import com.bea.olp.PRT_BASICINFO_JB;

public interface PRT_BASICINFO_JBMapper {
    int deleteByPrimaryKey(String certCode);

    int insert(PRT_BASICINFO_JB record);

    int insertSelective(PRT_BASICINFO_JB record);

    PRT_BASICINFO_JB selectByPrimaryKey(String certCode);

    int updateByPrimaryKeySelective(PRT_BASICINFO_JB record);

    int updateByPrimaryKey(PRT_BASICINFO_JB record);
}