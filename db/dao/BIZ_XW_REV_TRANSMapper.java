package com.bea.dao;

import com.bea.olp.BIZ_XW_REV_TRANS;
import com.bea.olp.BIZ_XW_REV_TRANSKey;

public interface BIZ_XW_REV_TRANSMapper {
    int deleteByPrimaryKey(BIZ_XW_REV_TRANSKey key);

    int insert(BIZ_XW_REV_TRANS record);

    int insertSelective(BIZ_XW_REV_TRANS record);

    BIZ_XW_REV_TRANS selectByPrimaryKey(BIZ_XW_REV_TRANSKey key);

    int updateByPrimaryKeySelective(BIZ_XW_REV_TRANS record);

    int updateByPrimaryKey(BIZ_XW_REV_TRANS record);
}