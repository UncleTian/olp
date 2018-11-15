package com.bea.dao;

import com.bea.olp.S_ROLE_RULE;
import com.bea.olp.S_ROLE_RULEKey;

public interface S_ROLE_RULEMapper {
    int deleteByPrimaryKey(S_ROLE_RULEKey key);

    int insert(S_ROLE_RULE record);

    int insertSelective(S_ROLE_RULE record);

    S_ROLE_RULE selectByPrimaryKey(S_ROLE_RULEKey key);

    int updateByPrimaryKeySelective(S_ROLE_RULE record);

    int updateByPrimaryKey(S_ROLE_RULE record);
}