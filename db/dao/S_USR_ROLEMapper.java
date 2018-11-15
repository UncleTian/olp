package com.bea.dao;

import com.bea.olp.S_USR_ROLE;
import com.bea.olp.S_USR_ROLEKey;

public interface S_USR_ROLEMapper {
    int deleteByPrimaryKey(S_USR_ROLEKey key);

    int insert(S_USR_ROLE record);

    int insertSelective(S_USR_ROLE record);

    S_USR_ROLE selectByPrimaryKey(S_USR_ROLEKey key);

    int updateByPrimaryKeySelective(S_USR_ROLE record);

    int updateByPrimaryKey(S_USR_ROLE record);
}