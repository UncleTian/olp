package com.bea.dao;

import com.bea.olp.WF_NODE_EXTEND_PROPERTY;

public interface WF_NODE_EXTEND_PROPERTYMapper {
    int deleteByPrimaryKey(String nodeid);

    int insert(WF_NODE_EXTEND_PROPERTY record);

    int insertSelective(WF_NODE_EXTEND_PROPERTY record);

    WF_NODE_EXTEND_PROPERTY selectByPrimaryKey(String nodeid);

    int updateByPrimaryKeySelective(WF_NODE_EXTEND_PROPERTY record);

    int updateByPrimaryKey(WF_NODE_EXTEND_PROPERTY record);
}