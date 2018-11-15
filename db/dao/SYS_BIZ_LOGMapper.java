package com.bea.dao;

import com.bea.olp.SYS_BIZ_LOG;

public interface SYS_BIZ_LOGMapper {
    int insert(SYS_BIZ_LOG record);

    int insertSelective(SYS_BIZ_LOG record);
}