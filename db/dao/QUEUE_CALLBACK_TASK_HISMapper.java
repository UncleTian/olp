package com.bea.dao;

import com.bea.olp.QUEUE_CALLBACK_TASK_HIS;

public interface QUEUE_CALLBACK_TASK_HISMapper {
    int deleteByPrimaryKey(String noticeNo);

    int insert(QUEUE_CALLBACK_TASK_HIS record);

    int insertSelective(QUEUE_CALLBACK_TASK_HIS record);

    QUEUE_CALLBACK_TASK_HIS selectByPrimaryKey(String noticeNo);

    int updateByPrimaryKeySelective(QUEUE_CALLBACK_TASK_HIS record);

    int updateByPrimaryKey(QUEUE_CALLBACK_TASK_HIS record);
}