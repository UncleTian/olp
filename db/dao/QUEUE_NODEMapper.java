package com.bea.dao;

import com.bea.olp.QUEUE_NODE;
import com.bea.olp.QUEUE_NODEKey;

public interface QUEUE_NODEMapper {
    int deleteByPrimaryKey(QUEUE_NODEKey key);

    int insert(QUEUE_NODE record);

    int insertSelective(QUEUE_NODE record);

    QUEUE_NODE selectByPrimaryKey(QUEUE_NODEKey key);

    int updateByPrimaryKeySelective(QUEUE_NODE record);

    int updateByPrimaryKey(QUEUE_NODE record);
}