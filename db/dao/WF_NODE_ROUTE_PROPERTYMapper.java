package com.bea.dao;

import com.bea.olp.WF_NODE_ROUTE_PROPERTY;

public interface WF_NODE_ROUTE_PROPERTYMapper {
    int deleteByPrimaryKey(String routeid);

    int insert(WF_NODE_ROUTE_PROPERTY record);

    int insertSelective(WF_NODE_ROUTE_PROPERTY record);

    WF_NODE_ROUTE_PROPERTY selectByPrimaryKey(String routeid);

    int updateByPrimaryKeySelective(WF_NODE_ROUTE_PROPERTY record);

    int updateByPrimaryKey(WF_NODE_ROUTE_PROPERTY record);
}