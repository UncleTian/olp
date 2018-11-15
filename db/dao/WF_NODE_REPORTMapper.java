package com.bea.dao;

import com.bea.olp.WF_NODE_REPORT;
import com.bea.olp.WF_NODE_REPORTKey;

public interface WF_NODE_REPORTMapper {
    int deleteByPrimaryKey(WF_NODE_REPORTKey key);

    int insert(WF_NODE_REPORT record);

    int insertSelective(WF_NODE_REPORT record);

    WF_NODE_REPORT selectByPrimaryKey(WF_NODE_REPORTKey key);

    int updateByPrimaryKeySelective(WF_NODE_REPORT record);

    int updateByPrimaryKey(WF_NODE_REPORT record);
}