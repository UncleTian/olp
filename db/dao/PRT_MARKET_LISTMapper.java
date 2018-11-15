package com.bea.dao;

import com.bea.olp.PRT_MARKET_LIST;
import com.bea.olp.PRT_MARKET_LISTKey;

public interface PRT_MARKET_LISTMapper {
    int deleteByPrimaryKey(PRT_MARKET_LISTKey key);

    int insert(PRT_MARKET_LIST record);

    int insertSelective(PRT_MARKET_LIST record);

    PRT_MARKET_LIST selectByPrimaryKey(PRT_MARKET_LISTKey key);

    int updateByPrimaryKeySelective(PRT_MARKET_LIST record);

    int updateByPrimaryKey(PRT_MARKET_LIST record);
}