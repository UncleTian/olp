package com.bea.dao;

import com.bea.olp.CRD_CONT_TXT;

public interface CRD_CONT_TXTMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(CRD_CONT_TXT record);

    int insertSelective(CRD_CONT_TXT record);

    CRD_CONT_TXT selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(CRD_CONT_TXT record);

    int updateByPrimaryKey(CRD_CONT_TXT record);
}