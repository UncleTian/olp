package com.bea.dao;

import com.bea.olp.BAT_PRC_EXECUTE_LOG;

public interface BAT_PRC_EXECUTE_LOGMapper {
    int deleteByPrimaryKey(String serno);

    int insert(BAT_PRC_EXECUTE_LOG record);

    int insertSelective(BAT_PRC_EXECUTE_LOG record);

    BAT_PRC_EXECUTE_LOG selectByPrimaryKey(String serno);

    int updateByPrimaryKeySelective(BAT_PRC_EXECUTE_LOG record);

    int updateByPrimaryKey(BAT_PRC_EXECUTE_LOG record);
}