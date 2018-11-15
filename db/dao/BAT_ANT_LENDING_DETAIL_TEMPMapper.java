package com.bea.dao;

import com.bea.olp.BAT_ANT_LENDING_DETAIL_TEMP;

public interface BAT_ANT_LENDING_DETAIL_TEMPMapper {
    int deleteByPrimaryKey(String contractNo);

    int insert(BAT_ANT_LENDING_DETAIL_TEMP record);

    int insertSelective(BAT_ANT_LENDING_DETAIL_TEMP record);

    BAT_ANT_LENDING_DETAIL_TEMP selectByPrimaryKey(String contractNo);

    int updateByPrimaryKeySelective(BAT_ANT_LENDING_DETAIL_TEMP record);

    int updateByPrimaryKey(BAT_ANT_LENDING_DETAIL_TEMP record);
}