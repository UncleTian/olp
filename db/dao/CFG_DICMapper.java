package com.bea.dao;

import com.bea.olp.CFG_DIC;
import com.bea.olp.CFG_DICKey;

public interface CFG_DICMapper {
    int deleteByPrimaryKey(CFG_DICKey key);

    int insert(CFG_DIC record);

    int insertSelective(CFG_DIC record);

    CFG_DIC selectByPrimaryKey(CFG_DICKey key);

    int updateByPrimaryKeySelective(CFG_DIC record);

    int updateByPrimaryKey(CFG_DIC record);
}