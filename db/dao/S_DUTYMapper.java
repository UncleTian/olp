package com.bea.dao;

import com.bea.olp.S_DUTY;
import com.bea.olp.S_DUTYKey;

public interface S_DUTYMapper {
    int deleteByPrimaryKey(S_DUTYKey key);

    int insert(S_DUTY record);

    int insertSelective(S_DUTY record);

    S_DUTY selectByPrimaryKey(S_DUTYKey key);

    int updateByPrimaryKeySelective(S_DUTY record);

    int updateByPrimaryKey(S_DUTY record);
}