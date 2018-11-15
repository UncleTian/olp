package com.bea.dao;

import com.bea.olp.WF_TASKPOOL_USERKey;

public interface WF_TASKPOOL_USERMapper {
    int deleteByPrimaryKey(WF_TASKPOOL_USERKey key);

    int insert(WF_TASKPOOL_USERKey record);

    int insertSelective(WF_TASKPOOL_USERKey record);
}