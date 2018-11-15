package com.bea.dao;

import com.bea.olp.BAT_TASK_RUN;
import com.bea.olp.BAT_TASK_RUNKey;

public interface BAT_TASK_RUNMapper {
    int deleteByPrimaryKey(BAT_TASK_RUNKey key);

    int insert(BAT_TASK_RUN record);

    int insertSelective(BAT_TASK_RUN record);

    BAT_TASK_RUN selectByPrimaryKey(BAT_TASK_RUNKey key);

    int updateByPrimaryKeySelective(BAT_TASK_RUN record);

    int updateByPrimaryKey(BAT_TASK_RUN record);
}