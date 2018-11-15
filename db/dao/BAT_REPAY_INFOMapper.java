package com.bea.dao;

import com.bea.olp.BAT_REPAY_INFO;

public interface BAT_REPAY_INFOMapper {
    int insert(BAT_REPAY_INFO record);

    int insertSelective(BAT_REPAY_INFO record);
}