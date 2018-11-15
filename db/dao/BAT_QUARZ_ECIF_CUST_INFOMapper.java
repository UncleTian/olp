package com.bea.dao;

import com.bea.olp.BAT_QUARZ_ECIF_CUST_INFO;

public interface BAT_QUARZ_ECIF_CUST_INFOMapper {
    int deleteByPrimaryKey(String cusId);

    int insert(BAT_QUARZ_ECIF_CUST_INFO record);

    int insertSelective(BAT_QUARZ_ECIF_CUST_INFO record);

    BAT_QUARZ_ECIF_CUST_INFO selectByPrimaryKey(String cusId);

    int updateByPrimaryKeySelective(BAT_QUARZ_ECIF_CUST_INFO record);

    int updateByPrimaryKey(BAT_QUARZ_ECIF_CUST_INFO record);
}