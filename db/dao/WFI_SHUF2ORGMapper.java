package com.bea.dao;

import com.bea.olp.WFI_SHUF2ORG;
import com.bea.olp.WFI_SHUF2ORGKey;

public interface WFI_SHUF2ORGMapper {
    int deleteByPrimaryKey(WFI_SHUF2ORGKey key);

    int insert(WFI_SHUF2ORG record);

    int insertSelective(WFI_SHUF2ORG record);

    WFI_SHUF2ORG selectByPrimaryKey(WFI_SHUF2ORGKey key);

    int updateByPrimaryKeySelective(WFI_SHUF2ORG record);

    int updateByPrimaryKey(WFI_SHUF2ORG record);
}