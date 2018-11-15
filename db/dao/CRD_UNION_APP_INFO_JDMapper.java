package com.bea.dao;

import com.bea.olp.CRD_UNION_APP_INFO_JD;

public interface CRD_UNION_APP_INFO_JDMapper {
    int deleteByPrimaryKey(String mhtApplyNo);

    int insert(CRD_UNION_APP_INFO_JD record);

    int insertSelective(CRD_UNION_APP_INFO_JD record);

    CRD_UNION_APP_INFO_JD selectByPrimaryKey(String mhtApplyNo);

    int updateByPrimaryKeySelective(CRD_UNION_APP_INFO_JD record);

    int updateByPrimaryKey(CRD_UNION_APP_INFO_JD record);
}