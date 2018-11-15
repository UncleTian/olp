package com.bea.dao;

import com.bea.olp.SF_RULESETINFO;

public interface SF_RULESETINFOMapper {
    int deleteByPrimaryKey(String name);

    int insert(SF_RULESETINFO record);

    int insertSelective(SF_RULESETINFO record);

    SF_RULESETINFO selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(SF_RULESETINFO record);

    int updateByPrimaryKey(SF_RULESETINFO record);
}