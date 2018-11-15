package com.bea.dao;

import com.bea.olp.WFI_BIZ_VAR_RECORD;

public interface WFI_BIZ_VAR_RECORDMapper {
    int deleteByPrimaryKey(String pk1);

    int insert(WFI_BIZ_VAR_RECORD record);

    int insertSelective(WFI_BIZ_VAR_RECORD record);

    WFI_BIZ_VAR_RECORD selectByPrimaryKey(String pk1);

    int updateByPrimaryKeySelective(WFI_BIZ_VAR_RECORD record);

    int updateByPrimaryKey(WFI_BIZ_VAR_RECORD record);
}