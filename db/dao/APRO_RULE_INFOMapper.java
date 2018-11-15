package com.bea.dao;

import com.bea.olp.APRO_RULE_INFO;

public interface APRO_RULE_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(APRO_RULE_INFO record);

    int insertSelective(APRO_RULE_INFO record);

    APRO_RULE_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(APRO_RULE_INFO record);

    int updateByPrimaryKey(APRO_RULE_INFO record);
}