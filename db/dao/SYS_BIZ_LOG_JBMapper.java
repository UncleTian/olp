package com.bea.dao;

import com.bea.olp.SYS_BIZ_LOG_JB;

public interface SYS_BIZ_LOG_JBMapper {
    int insert(SYS_BIZ_LOG_JB record);

    int insertSelective(SYS_BIZ_LOG_JB record);
}