package com.bea.dao;

import com.bea.olp.BIZ_CII_INFO;
import com.bea.olp.BIZ_CII_INFOWithBLOBs;

public interface BIZ_CII_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_CII_INFOWithBLOBs record);

    int insertSelective(BIZ_CII_INFOWithBLOBs record);

    BIZ_CII_INFOWithBLOBs selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_CII_INFOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BIZ_CII_INFOWithBLOBs record);

    int updateByPrimaryKey(BIZ_CII_INFO record);
}