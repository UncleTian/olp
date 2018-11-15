package com.bea.dao;

import com.bea.olp.BIZ_ANT_FUND_DETAIL;

public interface BIZ_ANT_FUND_DETAILMapper {
    int deleteByPrimaryKey(String bizNbr);

    int insert(BIZ_ANT_FUND_DETAIL record);

    int insertSelective(BIZ_ANT_FUND_DETAIL record);

    BIZ_ANT_FUND_DETAIL selectByPrimaryKey(String bizNbr);

    int updateByPrimaryKeySelective(BIZ_ANT_FUND_DETAIL record);

    int updateByPrimaryKey(BIZ_ANT_FUND_DETAIL record);
}