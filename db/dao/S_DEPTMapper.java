package com.bea.dao;

import com.bea.olp.S_DEPT;
import com.bea.olp.S_DEPTKey;

public interface S_DEPTMapper {
    int deleteByPrimaryKey(S_DEPTKey key);

    int insert(S_DEPT record);

    int insertSelective(S_DEPT record);

    S_DEPT selectByPrimaryKey(S_DEPTKey key);

    int updateByPrimaryKeySelective(S_DEPT record);

    int updateByPrimaryKey(S_DEPT record);
}