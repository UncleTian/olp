package com.bea.dao;

import com.bea.olp.CFG_RISK_PRICING;
import com.bea.olp.CFG_RISK_PRICINGKey;

public interface CFG_RISK_PRICINGMapper {
    int deleteByPrimaryKey(CFG_RISK_PRICINGKey key);

    int insert(CFG_RISK_PRICING record);

    int insertSelective(CFG_RISK_PRICING record);

    CFG_RISK_PRICING selectByPrimaryKey(CFG_RISK_PRICINGKey key);

    int updateByPrimaryKeySelective(CFG_RISK_PRICING record);

    int updateByPrimaryKey(CFG_RISK_PRICING record);
}