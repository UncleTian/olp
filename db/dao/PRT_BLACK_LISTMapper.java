package com.bea.dao;

import com.bea.olp.PRT_BLACK_LIST;

public interface PRT_BLACK_LISTMapper {
    int deleteByPrimaryKey(String serNo);

    int insert(PRT_BLACK_LIST record);

    int insertSelective(PRT_BLACK_LIST record);

    PRT_BLACK_LIST selectByPrimaryKey(String serNo);

    int updateByPrimaryKeySelective(PRT_BLACK_LIST record);

    int updateByPrimaryKey(PRT_BLACK_LIST record);
}