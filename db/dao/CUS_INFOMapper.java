package com.bea.dao;

import com.bea.olp.CUS_INFO;

public interface CUS_INFOMapper {
    int deleteByPrimaryKey(String custId);

    int insert(CUS_INFO record);

    int insertSelective(CUS_INFO record);

    CUS_INFO selectByPrimaryKey(String custId);

    int updateByPrimaryKeySelective(CUS_INFO record);

    int updateByPrimaryKey(CUS_INFO record);
}