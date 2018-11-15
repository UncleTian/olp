package com.bea.dao;

import com.bea.olp.PRT_BEST_EMP_LIST;

public interface PRT_BEST_EMP_LISTMapper {
    int deleteByPrimaryKey(String serNo);

    int insert(PRT_BEST_EMP_LIST record);

    int insertSelective(PRT_BEST_EMP_LIST record);

    PRT_BEST_EMP_LIST selectByPrimaryKey(String serNo);

    int updateByPrimaryKeySelective(PRT_BEST_EMP_LIST record);

    int updateByPrimaryKey(PRT_BEST_EMP_LIST record);
}