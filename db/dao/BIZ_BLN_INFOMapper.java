package com.bea.dao;

import com.bea.olp.BIZ_BLN_INFO;

public interface BIZ_BLN_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_BLN_INFO record);

    int insertSelective(BIZ_BLN_INFO record);

    BIZ_BLN_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_BLN_INFO record);

    int updateByPrimaryKey(BIZ_BLN_INFO record);
}