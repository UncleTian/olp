package com.bea.dao;

import com.bea.olp.BAT_TRANSFER_CFG;

public interface BAT_TRANSFER_CFGMapper {
    int deleteByPrimaryKey(String taskNo);

    int insert(BAT_TRANSFER_CFG record);

    int insertSelective(BAT_TRANSFER_CFG record);

    BAT_TRANSFER_CFG selectByPrimaryKey(String taskNo);

    int updateByPrimaryKeySelective(BAT_TRANSFER_CFG record);

    int updateByPrimaryKey(BAT_TRANSFER_CFG record);
}