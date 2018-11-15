package com.bea.dao;

import com.bea.olp.AMT_INFO;

public interface AMT_INFOMapper {
    int deleteByPrimaryKey(String serno);

    int insert(AMT_INFO record);

    int insertSelective(AMT_INFO record);

    AMT_INFO selectByPrimaryKey(String serno);

    int updateByPrimaryKeySelective(AMT_INFO record);

    int updateByPrimaryKey(AMT_INFO record);
}