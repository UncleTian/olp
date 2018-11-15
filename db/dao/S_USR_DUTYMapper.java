package com.bea.dao;

import com.bea.olp.S_USR_DUTY;
import com.bea.olp.S_USR_DUTYKey;

public interface S_USR_DUTYMapper {
    int deleteByPrimaryKey(S_USR_DUTYKey key);

    int insert(S_USR_DUTY record);

    int insertSelective(S_USR_DUTY record);

    S_USR_DUTY selectByPrimaryKey(S_USR_DUTYKey key);

    int updateByPrimaryKeySelective(S_USR_DUTY record);

    int updateByPrimaryKey(S_USR_DUTY record);
}