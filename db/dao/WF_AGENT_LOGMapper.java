package com.bea.dao;

import com.bea.olp.WF_AGENT_LOG;
import com.bea.olp.WF_AGENT_LOGKey;

public interface WF_AGENT_LOGMapper {
    int deleteByPrimaryKey(WF_AGENT_LOGKey key);

    int insert(WF_AGENT_LOG record);

    int insertSelective(WF_AGENT_LOG record);

    WF_AGENT_LOG selectByPrimaryKey(WF_AGENT_LOGKey key);

    int updateByPrimaryKeySelective(WF_AGENT_LOG record);

    int updateByPrimaryKey(WF_AGENT_LOG record);
}