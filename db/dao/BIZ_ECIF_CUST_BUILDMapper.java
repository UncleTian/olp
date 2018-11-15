package com.bea.dao;

import com.bea.olp.BIZ_ECIF_CUST_BUILD;

public interface BIZ_ECIF_CUST_BUILDMapper {
    int deleteByPrimaryKey(String flowId);

    int insert(BIZ_ECIF_CUST_BUILD record);

    int insertSelective(BIZ_ECIF_CUST_BUILD record);

    BIZ_ECIF_CUST_BUILD selectByPrimaryKey(String flowId);

    int updateByPrimaryKeySelective(BIZ_ECIF_CUST_BUILD record);

    int updateByPrimaryKey(BIZ_ECIF_CUST_BUILD record);
}