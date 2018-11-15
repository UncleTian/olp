package com.bea.dao;

import com.bea.olp.SYS_BIZ_LOG_JD;
import com.bea.olp.SYS_BIZ_LOG_JDWithBLOBs;

public interface SYS_BIZ_LOG_JDMapper {
    int deleteByPrimaryKey(String logNo);

    int insert(SYS_BIZ_LOG_JDWithBLOBs record);

    int insertSelective(SYS_BIZ_LOG_JDWithBLOBs record);

    SYS_BIZ_LOG_JDWithBLOBs selectByPrimaryKey(String logNo);

    int updateByPrimaryKeySelective(SYS_BIZ_LOG_JDWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SYS_BIZ_LOG_JDWithBLOBs record);

    int updateByPrimaryKey(SYS_BIZ_LOG_JD record);
}