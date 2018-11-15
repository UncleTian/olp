package com.bea.dao;

import com.bea.olp.BAT_TASK_LOG;

public interface BAT_TASK_LOGMapper {
    int deleteByPrimaryKey(String serno);

    int insert(BAT_TASK_LOG record);

    int insertSelective(BAT_TASK_LOG record);

    BAT_TASK_LOG selectByPrimaryKey(String serno);

    int updateByPrimaryKeySelective(BAT_TASK_LOG record);

    int updateByPrimaryKey(BAT_TASK_LOG record);
}