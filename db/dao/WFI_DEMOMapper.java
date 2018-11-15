package com.bea.dao;

import com.bea.olp.WFI_DEMO;

public interface WFI_DEMOMapper {
    int deleteByPrimaryKey(String serno);

    int insert(WFI_DEMO record);

    int insertSelective(WFI_DEMO record);

    WFI_DEMO selectByPrimaryKey(String serno);

    int updateByPrimaryKeySelective(WFI_DEMO record);

    int updateByPrimaryKey(WFI_DEMO record);
}