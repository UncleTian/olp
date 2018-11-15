package com.bea.dao;

import com.bea.olp.S_PERMISSIONS_LOG;

public interface S_PERMISSIONS_LOGMapper {
    int deleteByPrimaryKey(String ctDate);

    int insert(S_PERMISSIONS_LOG record);

    int insertSelective(S_PERMISSIONS_LOG record);

    S_PERMISSIONS_LOG selectByPrimaryKey(String ctDate);

    int updateByPrimaryKeySelective(S_PERMISSIONS_LOG record);

    int updateByPrimaryKey(S_PERMISSIONS_LOG record);
}