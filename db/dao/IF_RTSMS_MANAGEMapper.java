package com.bea.dao;

import com.bea.olp.IF_RTSMS_MANAGE;
import com.bea.olp.IF_RTSMS_MANAGEKey;

public interface IF_RTSMS_MANAGEMapper {
    int deleteByPrimaryKey(IF_RTSMS_MANAGEKey key);

    int insert(IF_RTSMS_MANAGE record);

    int insertSelective(IF_RTSMS_MANAGE record);

    IF_RTSMS_MANAGE selectByPrimaryKey(IF_RTSMS_MANAGEKey key);

    int updateByPrimaryKeySelective(IF_RTSMS_MANAGE record);

    int updateByPrimaryKey(IF_RTSMS_MANAGE record);
}