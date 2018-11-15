package com.bea.dao;

import com.bea.olp.BAT_CONTROL_HIS;

public interface BAT_CONTROL_HISMapper {
    int deleteByPrimaryKey(String openDay);

    int insert(BAT_CONTROL_HIS record);

    int insertSelective(BAT_CONTROL_HIS record);

    BAT_CONTROL_HIS selectByPrimaryKey(String openDay);

    int updateByPrimaryKeySelective(BAT_CONTROL_HIS record);

    int updateByPrimaryKey(BAT_CONTROL_HIS record);
}