package com.bea.dao;

import com.bea.olp.CRD_UNION_APP_INFO_JB;

public interface CRD_UNION_APP_INFO_JBMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(CRD_UNION_APP_INFO_JB record);

    int insertSelective(CRD_UNION_APP_INFO_JB record);

    CRD_UNION_APP_INFO_JB selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(CRD_UNION_APP_INFO_JB record);

    int updateByPrimaryKey(CRD_UNION_APP_INFO_JB record);
}