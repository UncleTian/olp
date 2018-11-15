package com.bea.dao;

import com.bea.olp.IF_BATSMS_MANAGE;

public interface IF_BATSMS_MANAGEMapper {
    int deleteByPrimaryKey(String serno);

    int insert(IF_BATSMS_MANAGE record);

    int insertSelective(IF_BATSMS_MANAGE record);

    IF_BATSMS_MANAGE selectByPrimaryKey(String serno);

    int updateByPrimaryKeySelective(IF_BATSMS_MANAGE record);

    int updateByPrimaryKey(IF_BATSMS_MANAGE record);
}