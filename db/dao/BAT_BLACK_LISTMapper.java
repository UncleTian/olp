package com.bea.dao;

import com.bea.olp.BAT_BLACK_LIST;

public interface BAT_BLACK_LISTMapper {
    int insert(BAT_BLACK_LIST record);

    int insertSelective(BAT_BLACK_LIST record);
}