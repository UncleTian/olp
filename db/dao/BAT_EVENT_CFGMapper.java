package com.bea.dao;

import com.bea.olp.BAT_EVENT_CFG;

public interface BAT_EVENT_CFGMapper {
    int deleteByPrimaryKey(String eventNo);

    int insert(BAT_EVENT_CFG record);

    int insertSelective(BAT_EVENT_CFG record);

    BAT_EVENT_CFG selectByPrimaryKey(String eventNo);

    int updateByPrimaryKeySelective(BAT_EVENT_CFG record);

    int updateByPrimaryKey(BAT_EVENT_CFG record);
}