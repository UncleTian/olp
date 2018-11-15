package com.bea.dao;

import com.bea.olp.COO_AGR_INFO;

public interface COO_AGR_INFOMapper {
    int deleteByPrimaryKey(String agreementNo);

    int insert(COO_AGR_INFO record);

    int insertSelective(COO_AGR_INFO record);

    COO_AGR_INFO selectByPrimaryKey(String agreementNo);

    int updateByPrimaryKeySelective(COO_AGR_INFO record);

    int updateByPrimaryKey(COO_AGR_INFO record);
}