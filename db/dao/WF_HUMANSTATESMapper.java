package com.bea.dao;

import com.bea.olp.WF_HUMANSTATES;

public interface WF_HUMANSTATESMapper {
    int deleteByPrimaryKey(String pkey);

    int insert(WF_HUMANSTATES record);

    int insertSelective(WF_HUMANSTATES record);

    WF_HUMANSTATES selectByPrimaryKey(String pkey);

    int updateByPrimaryKeySelective(WF_HUMANSTATES record);

    int updateByPrimaryKey(WF_HUMANSTATES record);
}