package com.bea.dao;

import com.bea.olp.BAT_WHITE_LIST;

public interface BAT_WHITE_LISTMapper {
    int insert(BAT_WHITE_LIST record);

    int insertSelective(BAT_WHITE_LIST record);
}