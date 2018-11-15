package com.bea.dao;

import com.bea.olp.WF_NODE_ACTION_RECORDEND;

public interface WF_NODE_ACTION_RECORDENDMapper {
    int deleteByPrimaryKey(String nodeactionid);

    int insert(WF_NODE_ACTION_RECORDEND record);

    int insertSelective(WF_NODE_ACTION_RECORDEND record);

    WF_NODE_ACTION_RECORDEND selectByPrimaryKey(String nodeactionid);

    int updateByPrimaryKeySelective(WF_NODE_ACTION_RECORDEND record);

    int updateByPrimaryKey(WF_NODE_ACTION_RECORDEND record);
}