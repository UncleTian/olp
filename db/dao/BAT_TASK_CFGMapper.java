package com.bea.dao;

import com.bea.olp.BAT_TASK_CFG;

public interface BAT_TASK_CFGMapper {
    int deleteByPrimaryKey(String taskNo);

    int insert(BAT_TASK_CFG record);

    int insertSelective(BAT_TASK_CFG record);

    BAT_TASK_CFG selectByPrimaryKey(String taskNo);

    int updateByPrimaryKeySelective(BAT_TASK_CFG record);

    int updateByPrimaryKey(BAT_TASK_CFG record);
}