package com.bea.dao;

import com.bea.olp.PSP_CHG_INFO;

public interface PSP_CHG_INFOMapper {
    int deleteByPrimaryKey(String chgNo);

    int insert(PSP_CHG_INFO record);

    int insertSelective(PSP_CHG_INFO record);

    PSP_CHG_INFO selectByPrimaryKey(String chgNo);

    int updateByPrimaryKeySelective(PSP_CHG_INFO record);

    int updateByPrimaryKey(PSP_CHG_INFO record);
}