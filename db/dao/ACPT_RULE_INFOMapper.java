package com.bea.dao;

import com.bea.olp.ACPT_RULE_INFO;

public interface ACPT_RULE_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(ACPT_RULE_INFO record);

    int insertSelective(ACPT_RULE_INFO record);

    ACPT_RULE_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(ACPT_RULE_INFO record);

    int updateByPrimaryKey(ACPT_RULE_INFO record);
}