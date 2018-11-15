package com.bea.dao;

import com.bea.olp.BIZ_CFG_INDUSTRY;

public interface BIZ_CFG_INDUSTRYMapper {
    int deleteByPrimaryKey(String industryId);

    int insert(BIZ_CFG_INDUSTRY record);

    int insertSelective(BIZ_CFG_INDUSTRY record);

    BIZ_CFG_INDUSTRY selectByPrimaryKey(String industryId);

    int updateByPrimaryKeySelective(BIZ_CFG_INDUSTRY record);

    int updateByPrimaryKey(BIZ_CFG_INDUSTRY record);
}