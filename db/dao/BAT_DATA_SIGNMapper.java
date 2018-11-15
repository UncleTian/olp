package com.bea.dao;

import com.bea.olp.BAT_DATA_SIGN;
import com.bea.olp.BAT_DATA_SIGNKey;

public interface BAT_DATA_SIGNMapper {
    int deleteByPrimaryKey(BAT_DATA_SIGNKey key);

    int insert(BAT_DATA_SIGN record);

    int insertSelective(BAT_DATA_SIGN record);

    BAT_DATA_SIGN selectByPrimaryKey(BAT_DATA_SIGNKey key);

    int updateByPrimaryKeySelective(BAT_DATA_SIGN record);

    int updateByPrimaryKey(BAT_DATA_SIGN record);
}