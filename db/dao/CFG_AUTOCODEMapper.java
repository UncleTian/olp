package com.bea.dao;

import com.bea.olp.CFG_AUTOCODE;
import com.bea.olp.CFG_AUTOCODEKey;

public interface CFG_AUTOCODEMapper {
    int deleteByPrimaryKey(CFG_AUTOCODEKey key);

    int insert(CFG_AUTOCODE record);

    int insertSelective(CFG_AUTOCODE record);

    CFG_AUTOCODE selectByPrimaryKey(CFG_AUTOCODEKey key);

    int updateByPrimaryKeySelective(CFG_AUTOCODE record);

    int updateByPrimaryKey(CFG_AUTOCODE record);
}