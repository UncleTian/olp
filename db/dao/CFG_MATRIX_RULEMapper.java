package com.bea.dao;

import com.bea.olp.CFG_MATRIX_RULE;

public interface CFG_MATRIX_RULEMapper {
    int deleteByPrimaryKey(String matrixId);

    int insert(CFG_MATRIX_RULE record);

    int insertSelective(CFG_MATRIX_RULE record);

    CFG_MATRIX_RULE selectByPrimaryKey(String matrixId);

    int updateByPrimaryKeySelective(CFG_MATRIX_RULE record);

    int updateByPrimaryKey(CFG_MATRIX_RULE record);
}