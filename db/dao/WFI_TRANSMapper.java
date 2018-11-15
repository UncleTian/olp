package com.bea.dao;

import com.bea.olp.WFI_TRANS;
import com.bea.olp.WFI_TRANSKey;

public interface WFI_TRANSMapper {
    int deleteByPrimaryKey(WFI_TRANSKey key);

    int insert(WFI_TRANS record);

    int insertSelective(WFI_TRANS record);

    WFI_TRANS selectByPrimaryKey(WFI_TRANSKey key);

    int updateByPrimaryKeySelective(WFI_TRANS record);

    int updateByPrimaryKey(WFI_TRANS record);
}