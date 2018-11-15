package com.bea.dao;

import com.bea.olp.CFG_AREA_MAPPING;
import com.bea.olp.CFG_AREA_MAPPINGKey;

public interface CFG_AREA_MAPPINGMapper {
    int deleteByPrimaryKey(CFG_AREA_MAPPINGKey key);

    int insert(CFG_AREA_MAPPING record);

    int insertSelective(CFG_AREA_MAPPING record);

    CFG_AREA_MAPPING selectByPrimaryKey(CFG_AREA_MAPPINGKey key);

    int updateByPrimaryKeySelective(CFG_AREA_MAPPING record);

    int updateByPrimaryKey(CFG_AREA_MAPPING record);
}