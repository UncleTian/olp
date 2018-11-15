package com.bea.dao;

import com.bea.olp.BIZ_TD_CROSS_EVENT_DETAIL;
import com.bea.olp.BIZ_TD_CROSS_EVENT_DETAILKey;

public interface BIZ_TD_CROSS_EVENT_DETAILMapper {
    int deleteByPrimaryKey(BIZ_TD_CROSS_EVENT_DETAILKey key);

    int insert(BIZ_TD_CROSS_EVENT_DETAIL record);

    int insertSelective(BIZ_TD_CROSS_EVENT_DETAIL record);

    BIZ_TD_CROSS_EVENT_DETAIL selectByPrimaryKey(BIZ_TD_CROSS_EVENT_DETAILKey key);

    int updateByPrimaryKeySelective(BIZ_TD_CROSS_EVENT_DETAIL record);

    int updateByPrimaryKey(BIZ_TD_CROSS_EVENT_DETAIL record);
}