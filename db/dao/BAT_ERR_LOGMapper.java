package com.bea.dao;

import com.bea.olp.BAT_ERR_LOG;

public interface BAT_ERR_LOGMapper {
    int insert(BAT_ERR_LOG record);

    int insertSelective(BAT_ERR_LOG record);
}