package com.bea.dao;

import com.bea.olp.RPT_WARN_LIST;

public interface RPT_WARN_LISTMapper {
    int deleteByPrimaryKey(String rptPk);

    int insert(RPT_WARN_LIST record);

    int insertSelective(RPT_WARN_LIST record);

    RPT_WARN_LIST selectByPrimaryKey(String rptPk);

    int updateByPrimaryKeySelective(RPT_WARN_LIST record);

    int updateByPrimaryKey(RPT_WARN_LIST record);
}