package com.bea.dao;

import com.bea.olp.CFG_SMS_TEMPLATE;

public interface CFG_SMS_TEMPLATEMapper {
    int deleteByPrimaryKey(String smsId);

    int insert(CFG_SMS_TEMPLATE record);

    int insertSelective(CFG_SMS_TEMPLATE record);

    CFG_SMS_TEMPLATE selectByPrimaryKey(String smsId);

    int updateByPrimaryKeySelective(CFG_SMS_TEMPLATE record);

    int updateByPrimaryKey(CFG_SMS_TEMPLATE record);
}