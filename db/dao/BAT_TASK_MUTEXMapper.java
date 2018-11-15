package com.bea.dao;

import com.bea.olp.BAT_TASK_MUTEX;

public interface BAT_TASK_MUTEXMapper {
    int deleteByPrimaryKey(String mutexNo);

    int insert(BAT_TASK_MUTEX record);

    int insertSelective(BAT_TASK_MUTEX record);

    BAT_TASK_MUTEX selectByPrimaryKey(String mutexNo);

    int updateByPrimaryKeySelective(BAT_TASK_MUTEX record);

    int updateByPrimaryKey(BAT_TASK_MUTEX record);
}