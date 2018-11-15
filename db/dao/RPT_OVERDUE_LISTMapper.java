package com.bea.dao;

import com.bea.olp.RPT_OVERDUE_LIST;

public interface RPT_OVERDUE_LISTMapper {
    int deleteByPrimaryKey(String seralNo);

    int insert(RPT_OVERDUE_LIST record);

    int insertSelective(RPT_OVERDUE_LIST record);

    RPT_OVERDUE_LIST selectByPrimaryKey(String seralNo);

    int updateByPrimaryKeySelective(RPT_OVERDUE_LIST record);

    int updateByPrimaryKey(RPT_OVERDUE_LIST record);
}