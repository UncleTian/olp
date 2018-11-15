package com.bea.dao;

import com.bea.olp.WF_LOG;

public interface WF_LOGMapper {
    int deleteByPrimaryKey(String logid);

    int insert(WF_LOG record);

    int insertSelective(WF_LOG record);

    WF_LOG selectByPrimaryKey(String logid);

    int updateByPrimaryKeySelective(WF_LOG record);

    int updateByPrimaryKey(WF_LOG record);
}