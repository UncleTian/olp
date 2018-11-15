package com.bea.dao;

import com.bea.olp.SF_STAT_CACHE;
import com.bea.olp.SF_STAT_CACHEKey;

public interface SF_STAT_CACHEMapper {
    int deleteByPrimaryKey(SF_STAT_CACHEKey key);

    int insert(SF_STAT_CACHE record);

    int insertSelective(SF_STAT_CACHE record);

    SF_STAT_CACHE selectByPrimaryKey(SF_STAT_CACHEKey key);

    int updateByPrimaryKeySelective(SF_STAT_CACHE record);

    int updateByPrimaryKey(SF_STAT_CACHE record);
}