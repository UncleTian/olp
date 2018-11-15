package com.bea.dao;

import com.bea.olp.RAT_SMS_MANAGE;

public interface RAT_SMS_MANAGEMapper {
    int deleteByPrimaryKey(String smsId);

    int insert(RAT_SMS_MANAGE record);

    int insertSelective(RAT_SMS_MANAGE record);

    RAT_SMS_MANAGE selectByPrimaryKey(String smsId);

    int updateByPrimaryKeySelective(RAT_SMS_MANAGE record);

    int updateByPrimaryKey(RAT_SMS_MANAGE record);
}