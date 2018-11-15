package com.bea.dao;

import com.bea.olp.BIZ_INTERPOSE_INFO;

public interface BIZ_INTERPOSE_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_INTERPOSE_INFO record);

    int insertSelective(BIZ_INTERPOSE_INFO record);

    BIZ_INTERPOSE_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_INTERPOSE_INFO record);

    int updateByPrimaryKey(BIZ_INTERPOSE_INFO record);
}