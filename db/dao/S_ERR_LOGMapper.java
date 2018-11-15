package com.bea.dao;

import com.bea.olp.S_ERR_LOG;

public interface S_ERR_LOGMapper {
    int deleteByPrimaryKey(String logSerno);

    int insert(S_ERR_LOG record);

    int insertSelective(S_ERR_LOG record);

    S_ERR_LOG selectByPrimaryKey(String logSerno);

    int updateByPrimaryKeySelective(S_ERR_LOG record);

    int updateByPrimaryKeyWithBLOBs(S_ERR_LOG record);

    int updateByPrimaryKey(S_ERR_LOG record);
}