package com.bea.dao;

import com.bea.olp.SYS_BIZ_LOG_XW;

public interface SYS_BIZ_LOG_XWMapper {
    int deleteByPrimaryKey(String logNo);

    int insert(SYS_BIZ_LOG_XW record);

    int insertSelective(SYS_BIZ_LOG_XW record);

    SYS_BIZ_LOG_XW selectByPrimaryKey(String logNo);

    int updateByPrimaryKeySelective(SYS_BIZ_LOG_XW record);

    int updateByPrimaryKey(SYS_BIZ_LOG_XW record);
}