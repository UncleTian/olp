package com.bea.dao;

import com.bea.olp.WF_PROPERTIES;

public interface WF_PROPERTIESMapper {
    int deleteByPrimaryKey(String propkey);

    int insert(WF_PROPERTIES record);

    int insertSelective(WF_PROPERTIES record);

    WF_PROPERTIES selectByPrimaryKey(String propkey);

    int updateByPrimaryKeySelective(WF_PROPERTIES record);

    int updateByPrimaryKey(WF_PROPERTIES record);
}