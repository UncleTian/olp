package com.bea.dao;

import com.bea.olp.BIZ_ANT_ZMINFO;

public interface BIZ_ANT_ZMINFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_ANT_ZMINFO record);

    int insertSelective(BIZ_ANT_ZMINFO record);

    BIZ_ANT_ZMINFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_ANT_ZMINFO record);

    int updateByPrimaryKey(BIZ_ANT_ZMINFO record);
}