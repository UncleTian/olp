package com.bea.dao;

import com.bea.olp.PRT_RALATE_LIST;

public interface PRT_RALATE_LISTMapper {
    int deleteByPrimaryKey(String serNo);

    int insert(PRT_RALATE_LIST record);

    int insertSelective(PRT_RALATE_LIST record);

    PRT_RALATE_LIST selectByPrimaryKey(String serNo);

    int updateByPrimaryKeySelective(PRT_RALATE_LIST record);

    int updateByPrimaryKey(PRT_RALATE_LIST record);
}