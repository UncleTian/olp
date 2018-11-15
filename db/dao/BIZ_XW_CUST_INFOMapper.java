package com.bea.dao;

import com.bea.olp.BIZ_XW_CUST_INFO;

public interface BIZ_XW_CUST_INFOMapper {
    int deleteByPrimaryKey(String custId);

    int insert(BIZ_XW_CUST_INFO record);

    int insertSelective(BIZ_XW_CUST_INFO record);

    BIZ_XW_CUST_INFO selectByPrimaryKey(String custId);

    int updateByPrimaryKeySelective(BIZ_XW_CUST_INFO record);

    int updateByPrimaryKey(BIZ_XW_CUST_INFO record);
}