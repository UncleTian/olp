package com.bea.dao;

import com.bea.olp.PRT_WATCH_LIST;

public interface PRT_WATCH_LISTMapper {
    int deleteByPrimaryKey(String serNo);

    int insert(PRT_WATCH_LIST record);

    int insertSelective(PRT_WATCH_LIST record);

    PRT_WATCH_LIST selectByPrimaryKey(String serNo);

    int updateByPrimaryKeySelective(PRT_WATCH_LIST record);

    int updateByPrimaryKey(PRT_WATCH_LIST record);
}