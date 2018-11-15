package com.bea.dao;

import com.bea.olp.BIZ_FIRST_CREDIT_INFO;
import com.bea.olp.BIZ_FIRST_CREDIT_INFOWithBLOBs;

public interface BIZ_FIRST_CREDIT_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_FIRST_CREDIT_INFOWithBLOBs record);

    int insertSelective(BIZ_FIRST_CREDIT_INFOWithBLOBs record);

    BIZ_FIRST_CREDIT_INFOWithBLOBs selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_FIRST_CREDIT_INFOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BIZ_FIRST_CREDIT_INFOWithBLOBs record);

    int updateByPrimaryKey(BIZ_FIRST_CREDIT_INFO record);
}