package com.bea.dao;

import com.bea.olp.WF_BLOB;

public interface WF_BLOBMapper {
    int deleteByPrimaryKey(String pkey);

    int insert(WF_BLOB record);

    int insertSelective(WF_BLOB record);

    WF_BLOB selectByPrimaryKey(String pkey);

    int updateByPrimaryKeySelective(WF_BLOB record);

    int updateByPrimaryKeyWithBLOBs(WF_BLOB record);
}