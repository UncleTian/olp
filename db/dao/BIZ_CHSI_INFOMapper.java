package com.bea.dao;

import com.bea.olp.BIZ_CHSI_INFO;

public interface BIZ_CHSI_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_CHSI_INFO record);

    int insertSelective(BIZ_CHSI_INFO record);

    BIZ_CHSI_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_CHSI_INFO record);

    int updateByPrimaryKey(BIZ_CHSI_INFO record);
}