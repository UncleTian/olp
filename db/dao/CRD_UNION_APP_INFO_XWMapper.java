package com.bea.dao;

import com.bea.olp.CRD_UNION_APP_INFO_XW;

public interface CRD_UNION_APP_INFO_XWMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(CRD_UNION_APP_INFO_XW record);

    int insertSelective(CRD_UNION_APP_INFO_XW record);

    CRD_UNION_APP_INFO_XW selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(CRD_UNION_APP_INFO_XW record);

    int updateByPrimaryKey(CRD_UNION_APP_INFO_XW record);
}