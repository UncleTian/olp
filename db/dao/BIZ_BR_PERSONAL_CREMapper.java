package com.bea.dao;

import com.bea.olp.BIZ_BR_PERSONAL_CRE;

public interface BIZ_BR_PERSONAL_CREMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_BR_PERSONAL_CRE record);

    int insertSelective(BIZ_BR_PERSONAL_CRE record);

    BIZ_BR_PERSONAL_CRE selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_BR_PERSONAL_CRE record);

    int updateByPrimaryKey(BIZ_BR_PERSONAL_CRE record);
}