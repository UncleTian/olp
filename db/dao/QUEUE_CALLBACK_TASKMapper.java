package com.bea.dao;

import com.bea.olp.QUEUE_CALLBACK_TASK;

public interface QUEUE_CALLBACK_TASKMapper {
    int deleteByPrimaryKey(String noticeNo);

    int insert(QUEUE_CALLBACK_TASK record);

    int insertSelective(QUEUE_CALLBACK_TASK record);

    QUEUE_CALLBACK_TASK selectByPrimaryKey(String noticeNo);

    int updateByPrimaryKeySelective(QUEUE_CALLBACK_TASK record);

    int updateByPrimaryKey(QUEUE_CALLBACK_TASK record);
}