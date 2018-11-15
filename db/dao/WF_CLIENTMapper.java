package com.bea.dao;

import com.bea.olp.WF_CLIENT;

public interface WF_CLIENTMapper {
    int deleteByPrimaryKey(String pkey);

    int insert(WF_CLIENT record);

    int insertSelective(WF_CLIENT record);

    WF_CLIENT selectByPrimaryKey(String pkey);

    int updateByPrimaryKeySelective(WF_CLIENT record);

    int updateByPrimaryKey(WF_CLIENT record);
}