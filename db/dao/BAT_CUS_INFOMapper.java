package com.bea.dao;

import com.bea.olp.BAT_CUS_INFO;

public interface BAT_CUS_INFOMapper {
    int insert(BAT_CUS_INFO record);

    int insertSelective(BAT_CUS_INFO record);
}