package com.bea.dao;

import com.bea.olp.S_USR;
import com.bea.olp.S_USRKey;

public interface S_USRMapper {
    int deleteByPrimaryKey(S_USRKey key);

    int insert(S_USR record);

    int insertSelective(S_USR record);

    S_USR selectByPrimaryKey(S_USRKey key);

    int updateByPrimaryKeySelective(S_USR record);

    int updateByPrimaryKey(S_USR record);
}