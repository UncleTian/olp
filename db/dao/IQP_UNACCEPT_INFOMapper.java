package com.bea.dao;

import com.bea.olp.IQP_UNACCEPT_INFO;

public interface IQP_UNACCEPT_INFOMapper {
    int deleteByPrimaryKey(String serno);

    int insert(IQP_UNACCEPT_INFO record);

    int insertSelective(IQP_UNACCEPT_INFO record);

    IQP_UNACCEPT_INFO selectByPrimaryKey(String serno);

    int updateByPrimaryKeySelective(IQP_UNACCEPT_INFO record);

    int updateByPrimaryKey(IQP_UNACCEPT_INFO record);
}