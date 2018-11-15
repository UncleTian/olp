package com.bea.dao;

import com.bea.olp.S_ROLE;
import com.bea.olp.S_ROLEKey;

public interface S_ROLEMapper {
    int deleteByPrimaryKey(S_ROLEKey key);

    int insert(S_ROLE record);

    int insertSelective(S_ROLE record);

    S_ROLE selectByPrimaryKey(S_ROLEKey key);

    int updateByPrimaryKeySelective(S_ROLE record);

    int updateByPrimaryKey(S_ROLE record);
}