package com.bea.dao;

import com.bea.olp.IQP_UNACCEPT_DETAIL;

public interface IQP_UNACCEPT_DETAILMapper {
    int deleteByPrimaryKey(String detailSerno);

    int insert(IQP_UNACCEPT_DETAIL record);

    int insertSelective(IQP_UNACCEPT_DETAIL record);

    IQP_UNACCEPT_DETAIL selectByPrimaryKey(String detailSerno);

    int updateByPrimaryKeySelective(IQP_UNACCEPT_DETAIL record);

    int updateByPrimaryKey(IQP_UNACCEPT_DETAIL record);
}