package com.bea.dao;

import com.bea.olp.BIZ_ZM_INFO;

public interface BIZ_ZM_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_ZM_INFO record);

    int insertSelective(BIZ_ZM_INFO record);

    BIZ_ZM_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_ZM_INFO record);

    int updateByPrimaryKey(BIZ_ZM_INFO record);
}