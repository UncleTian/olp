package com.bea.dao;

import com.bea.olp.BIZ_XW_BAL_TOL;

public interface BIZ_XW_BAL_TOLMapper {
    int deleteByPrimaryKey(String acctCheckDate);

    int insert(BIZ_XW_BAL_TOL record);

    int insertSelective(BIZ_XW_BAL_TOL record);

    BIZ_XW_BAL_TOL selectByPrimaryKey(String acctCheckDate);

    int updateByPrimaryKeySelective(BIZ_XW_BAL_TOL record);

    int updateByPrimaryKey(BIZ_XW_BAL_TOL record);
}