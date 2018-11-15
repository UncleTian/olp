package com.bea.dao;

import com.bea.olp.BIZ_ANT_REPAY_PLAN;
import com.bea.olp.BIZ_ANT_REPAY_PLANKey;

public interface BIZ_ANT_REPAY_PLANMapper {
    int deleteByPrimaryKey(BIZ_ANT_REPAY_PLANKey key);

    int insert(BIZ_ANT_REPAY_PLAN record);

    int insertSelective(BIZ_ANT_REPAY_PLAN record);

    BIZ_ANT_REPAY_PLAN selectByPrimaryKey(BIZ_ANT_REPAY_PLANKey key);

    int updateByPrimaryKeySelective(BIZ_ANT_REPAY_PLAN record);

    int updateByPrimaryKey(BIZ_ANT_REPAY_PLAN record);
}