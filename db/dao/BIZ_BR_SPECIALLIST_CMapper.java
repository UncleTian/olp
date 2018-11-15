package com.bea.dao;

import com.bea.olp.BIZ_BR_SPECIALLIST_C;

public interface BIZ_BR_SPECIALLIST_CMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_BR_SPECIALLIST_C record);

    int insertSelective(BIZ_BR_SPECIALLIST_C record);

    BIZ_BR_SPECIALLIST_C selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_BR_SPECIALLIST_C record);

    int updateByPrimaryKey(BIZ_BR_SPECIALLIST_C record);
}