package com.bea.dao;

import com.bea.olp.QUEUE_TASK;

public interface QUEUE_TASKMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(QUEUE_TASK record);

    int insertSelective(QUEUE_TASK record);

    QUEUE_TASK selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(QUEUE_TASK record);

    int updateByPrimaryKey(QUEUE_TASK record);
}