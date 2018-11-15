package com.bea.dao;

import com.bea.olp.BIZ_ECIF_CUST_INFO;

public interface BIZ_ECIF_CUST_INFOMapper {
    int insert(BIZ_ECIF_CUST_INFO record);

    int insertSelective(BIZ_ECIF_CUST_INFO record);
}