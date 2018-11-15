package com.bea.dao;

import com.bea.olp.LOG_AUDIT_CONFIG;

public interface LOG_AUDIT_CONFIGMapper {
    int deleteByPrimaryKey(String pkId);

    int insert(LOG_AUDIT_CONFIG record);

    int insertSelective(LOG_AUDIT_CONFIG record);

    LOG_AUDIT_CONFIG selectByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(LOG_AUDIT_CONFIG record);

    int updateByPrimaryKey(LOG_AUDIT_CONFIG record);
}