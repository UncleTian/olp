package com.bea.dao;

import com.bea.olp.WFI_SHUFFLE;

public interface WFI_SHUFFLEMapper {
    int deleteByPrimaryKey(String shfId);

    int insert(WFI_SHUFFLE record);

    int insertSelective(WFI_SHUFFLE record);

    WFI_SHUFFLE selectByPrimaryKey(String shfId);

    int updateByPrimaryKeySelective(WFI_SHUFFLE record);

    int updateByPrimaryKey(WFI_SHUFFLE record);
}