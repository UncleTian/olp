package com.bea.dao;

import com.bea.olp.COO_ENT_INFO;

public interface COO_ENT_INFOMapper {
    int deleteByPrimaryKey(String coEntNo);

    int insert(COO_ENT_INFO record);

    int insertSelective(COO_ENT_INFO record);

    COO_ENT_INFO selectByPrimaryKey(String coEntNo);

    int updateByPrimaryKeySelective(COO_ENT_INFO record);

    int updateByPrimaryKey(COO_ENT_INFO record);
}