package com.bea.dao;

import com.bea.olp.WF_NODE_RECORD;
import com.bea.olp.WF_NODE_RECORDKey;

public interface WF_NODE_RECORDMapper {
    int deleteByPrimaryKey(WF_NODE_RECORDKey key);

    int insert(WF_NODE_RECORD record);

    int insertSelective(WF_NODE_RECORD record);

    WF_NODE_RECORD selectByPrimaryKey(WF_NODE_RECORDKey key);

    int updateByPrimaryKeySelective(WF_NODE_RECORD record);

    int updateByPrimaryKey(WF_NODE_RECORD record);
}