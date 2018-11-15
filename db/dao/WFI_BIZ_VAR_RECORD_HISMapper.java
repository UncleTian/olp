package com.bea.dao;

import com.bea.olp.WFI_BIZ_VAR_RECORD_HIS;

public interface WFI_BIZ_VAR_RECORD_HISMapper {
    int deleteByPrimaryKey(String pk1);

    int insert(WFI_BIZ_VAR_RECORD_HIS record);

    int insertSelective(WFI_BIZ_VAR_RECORD_HIS record);

    WFI_BIZ_VAR_RECORD_HIS selectByPrimaryKey(String pk1);

    int updateByPrimaryKeySelective(WFI_BIZ_VAR_RECORD_HIS record);

    int updateByPrimaryKey(WFI_BIZ_VAR_RECORD_HIS record);
}