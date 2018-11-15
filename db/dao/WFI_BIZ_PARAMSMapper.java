package com.bea.dao;

import com.bea.olp.WFI_BIZ_PARAMS;

public interface WFI_BIZ_PARAMSMapper {
    int deleteByPrimaryKey(String valKey);

    int insert(WFI_BIZ_PARAMS record);

    int insertSelective(WFI_BIZ_PARAMS record);

    WFI_BIZ_PARAMS selectByPrimaryKey(String valKey);

    int updateByPrimaryKeySelective(WFI_BIZ_PARAMS record);

    int updateByPrimaryKey(WFI_BIZ_PARAMS record);
}