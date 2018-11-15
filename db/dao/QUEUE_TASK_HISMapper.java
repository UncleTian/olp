package com.bea.dao;

import com.bea.olp.QUEUE_TASK_HIS;

public interface QUEUE_TASK_HISMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(QUEUE_TASK_HIS record);

    int insertSelective(QUEUE_TASK_HIS record);

    QUEUE_TASK_HIS selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(QUEUE_TASK_HIS record);

    int updateByPrimaryKey(QUEUE_TASK_HIS record);
}