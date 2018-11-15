package com.bea.dao;

import com.bea.olp.PRT_WHITE_LIST;
import com.bea.olp.PRT_WHITE_LISTKey;

public interface PRT_WHITE_LISTMapper {
    int deleteByPrimaryKey(PRT_WHITE_LISTKey key);

    int insert(PRT_WHITE_LIST record);

    int insertSelective(PRT_WHITE_LIST record);

    PRT_WHITE_LIST selectByPrimaryKey(PRT_WHITE_LISTKey key);

    int updateByPrimaryKeySelective(PRT_WHITE_LIST record);

    int updateByPrimaryKey(PRT_WHITE_LIST record);
}