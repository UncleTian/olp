package com.bea.dao;

import com.bea.olp.WF_NODE_ACTION_RECORD;

public interface WF_NODE_ACTION_RECORDMapper {
    int deleteByPrimaryKey(String nodeactionid);

    int insert(WF_NODE_ACTION_RECORD record);

    int insertSelective(WF_NODE_ACTION_RECORD record);

    WF_NODE_ACTION_RECORD selectByPrimaryKey(String nodeactionid);

    int updateByPrimaryKeySelective(WF_NODE_ACTION_RECORD record);

    int updateByPrimaryKey(WF_NODE_ACTION_RECORD record);
}