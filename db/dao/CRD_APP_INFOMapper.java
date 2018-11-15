package com.bea.dao;

import com.bea.olp.CRD_APP_INFO;

public interface CRD_APP_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(CRD_APP_INFO record);

    int insertSelective(CRD_APP_INFO record);

    CRD_APP_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(CRD_APP_INFO record);

    int updateByPrimaryKey(CRD_APP_INFO record);
}