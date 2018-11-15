package com.bea.dao;

import com.bea.olp.BIZ_HH_COMP_INFO;

public interface BIZ_HH_COMP_INFOMapper {
    int deleteByPrimaryKey(String id);

    int insert(BIZ_HH_COMP_INFO record);

    int insertSelective(BIZ_HH_COMP_INFO record);

    BIZ_HH_COMP_INFO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BIZ_HH_COMP_INFO record);

    int updateByPrimaryKey(BIZ_HH_COMP_INFO record);
}