package com.bea.dao;

import com.bea.olp.WF_FREEDATE;

public interface WF_FREEDATEMapper {
    int deleteByPrimaryKey(String curdate);

    int insert(WF_FREEDATE record);

    int insertSelective(WF_FREEDATE record);

    WF_FREEDATE selectByPrimaryKey(String curdate);

    int updateByPrimaryKeySelective(WF_FREEDATE record);

    int updateByPrimaryKey(WF_FREEDATE record);
}