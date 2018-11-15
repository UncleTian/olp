package com.bea.dao;

import com.bea.olp.CRD_CONT_INFO;

public interface CRD_CONT_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(CRD_CONT_INFO record);

    int insertSelective(CRD_CONT_INFO record);

    CRD_CONT_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(CRD_CONT_INFO record);

    int updateByPrimaryKey(CRD_CONT_INFO record);
}