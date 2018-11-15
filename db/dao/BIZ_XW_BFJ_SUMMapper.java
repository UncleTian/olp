package com.bea.dao;

import com.bea.olp.BIZ_XW_BFJ_SUM;
import com.bea.olp.BIZ_XW_BFJ_SUMKey;

public interface BIZ_XW_BFJ_SUMMapper {
    int deleteByPrimaryKey(BIZ_XW_BFJ_SUMKey key);

    int insert(BIZ_XW_BFJ_SUM record);

    int insertSelective(BIZ_XW_BFJ_SUM record);

    BIZ_XW_BFJ_SUM selectByPrimaryKey(BIZ_XW_BFJ_SUMKey key);

    int updateByPrimaryKeySelective(BIZ_XW_BFJ_SUM record);

    int updateByPrimaryKey(BIZ_XW_BFJ_SUM record);
}