package com.bea.dao;

import com.bea.olp.BIZ_BORR_SUB_INFO;

public interface BIZ_BORR_SUB_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_BORR_SUB_INFO record);

    int insertSelective(BIZ_BORR_SUB_INFO record);

    BIZ_BORR_SUB_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_BORR_SUB_INFO record);

    int updateByPrimaryKey(BIZ_BORR_SUB_INFO record);
}