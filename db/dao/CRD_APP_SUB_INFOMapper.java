package com.bea.dao;

import com.bea.olp.CRD_APP_SUB_INFO;

public interface CRD_APP_SUB_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(CRD_APP_SUB_INFO record);

    int insertSelective(CRD_APP_SUB_INFO record);

    CRD_APP_SUB_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(CRD_APP_SUB_INFO record);

    int updateByPrimaryKey(CRD_APP_SUB_INFO record);
}