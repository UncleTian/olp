package com.bea.dao;

import com.bea.olp.WFI_WORKFLOW2BIZ;

public interface WFI_WORKFLOW2BIZMapper {
    int deleteByPrimaryKey(String pk1);

    int insert(WFI_WORKFLOW2BIZ record);

    int insertSelective(WFI_WORKFLOW2BIZ record);

    WFI_WORKFLOW2BIZ selectByPrimaryKey(String pk1);

    int updateByPrimaryKeySelective(WFI_WORKFLOW2BIZ record);

    int updateByPrimaryKey(WFI_WORKFLOW2BIZ record);
}