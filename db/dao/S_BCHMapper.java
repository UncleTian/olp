package com.bea.dao;

import com.bea.olp.S_BCH;
import com.bea.olp.S_BCHKey;

public interface S_BCHMapper {
    int deleteByPrimaryKey(S_BCHKey key);

    int insert(S_BCH record);

    int insertSelective(S_BCH record);

    S_BCH selectByPrimaryKey(S_BCHKey key);

    int updateByPrimaryKeySelective(S_BCH record);

    int updateByPrimaryKey(S_BCH record);
}