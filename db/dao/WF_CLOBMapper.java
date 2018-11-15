package com.bea.dao;

import com.bea.olp.WF_CLOB;

public interface WF_CLOBMapper {
    int deleteByPrimaryKey(String pkey);

    int insert(WF_CLOB record);

    int insertSelective(WF_CLOB record);

    WF_CLOB selectByPrimaryKey(String pkey);

    int updateByPrimaryKeySelective(WF_CLOB record);

    int updateByPrimaryKeyWithBLOBs(WF_CLOB record);
}