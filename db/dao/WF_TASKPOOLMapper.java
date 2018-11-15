package com.bea.dao;

import com.bea.olp.WF_TASKPOOL;

public interface WF_TASKPOOLMapper {
    int deleteByPrimaryKey(String tpid);

    int insert(WF_TASKPOOL record);

    int insertSelective(WF_TASKPOOL record);

    WF_TASKPOOL selectByPrimaryKey(String tpid);

    int updateByPrimaryKeySelective(WF_TASKPOOL record);

    int updateByPrimaryKey(WF_TASKPOOL record);
}