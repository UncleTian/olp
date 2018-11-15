package com.bea.dao;

import com.bea.olp.BIZ_TD_RISK_INFO;
import com.bea.olp.BIZ_TD_RISK_INFOKey;

public interface BIZ_TD_RISK_INFOMapper {
    int deleteByPrimaryKey(BIZ_TD_RISK_INFOKey key);

    int insert(BIZ_TD_RISK_INFO record);

    int insertSelective(BIZ_TD_RISK_INFO record);

    BIZ_TD_RISK_INFO selectByPrimaryKey(BIZ_TD_RISK_INFOKey key);

    int updateByPrimaryKeySelective(BIZ_TD_RISK_INFO record);

    int updateByPrimaryKey(BIZ_TD_RISK_INFO record);
}