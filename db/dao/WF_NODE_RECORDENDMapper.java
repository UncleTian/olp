package com.bea.dao;

import com.bea.olp.WF_NODE_RECORDEND;
import com.bea.olp.WF_NODE_RECORDENDKey;

public interface WF_NODE_RECORDENDMapper {
    int deleteByPrimaryKey(WF_NODE_RECORDENDKey key);

    int insert(WF_NODE_RECORDEND record);

    int insertSelective(WF_NODE_RECORDEND record);

    WF_NODE_RECORDEND selectByPrimaryKey(WF_NODE_RECORDENDKey key);

    int updateByPrimaryKeySelective(WF_NODE_RECORDEND record);

    int updateByPrimaryKey(WF_NODE_RECORDEND record);
}