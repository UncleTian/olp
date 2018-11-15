package com.bea.dao;

import com.bea.olp.WF_NODE_FIELD_PROPERTY;

public interface WF_NODE_FIELD_PROPERTYMapper {
    int deleteByPrimaryKey(String nodefieldid);

    int insert(WF_NODE_FIELD_PROPERTY record);

    int insertSelective(WF_NODE_FIELD_PROPERTY record);

    WF_NODE_FIELD_PROPERTY selectByPrimaryKey(String nodefieldid);

    int updateByPrimaryKeySelective(WF_NODE_FIELD_PROPERTY record);

    int updateByPrimaryKey(WF_NODE_FIELD_PROPERTY record);
}