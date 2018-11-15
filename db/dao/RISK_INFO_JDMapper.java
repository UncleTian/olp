package com.bea.dao;

import com.bea.olp.RISK_INFO_JD;
import com.bea.olp.RISK_INFO_JDWithBLOBs;

public interface RISK_INFO_JDMapper {
    int deleteByPrimaryKey(String mhtApplyNo);

    int insert(RISK_INFO_JDWithBLOBs record);

    int insertSelective(RISK_INFO_JDWithBLOBs record);

    RISK_INFO_JDWithBLOBs selectByPrimaryKey(String mhtApplyNo);

    int updateByPrimaryKeySelective(RISK_INFO_JDWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RISK_INFO_JDWithBLOBs record);

    int updateByPrimaryKey(RISK_INFO_JD record);
}