package com.bea.dao;

import com.bea.olp.PSP_RISK_WARN;

public interface PSP_RISK_WARNMapper {
    int deleteByPrimaryKey(String crdContNo);

    int insert(PSP_RISK_WARN record);

    int insertSelective(PSP_RISK_WARN record);

    PSP_RISK_WARN selectByPrimaryKey(String crdContNo);

    int updateByPrimaryKeySelective(PSP_RISK_WARN record);

    int updateByPrimaryKey(PSP_RISK_WARN record);
}