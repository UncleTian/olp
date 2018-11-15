package com.bea.dao;

import com.bea.olp.SYS_OP_LOG;

public interface SYS_OP_LOGMapper {
    int deleteByPrimaryKey(String logNo);

    int insert(SYS_OP_LOG record);

    int insertSelective(SYS_OP_LOG record);

    SYS_OP_LOG selectByPrimaryKey(String logNo);

    int updateByPrimaryKeySelective(SYS_OP_LOG record);

    int updateByPrimaryKey(SYS_OP_LOG record);
}