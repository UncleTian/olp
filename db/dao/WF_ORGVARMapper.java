package com.bea.dao;

import com.bea.olp.WF_ORGVAR;
import com.bea.olp.WF_ORGVARKey;

public interface WF_ORGVARMapper {
    int deleteByPrimaryKey(WF_ORGVARKey key);

    int insert(WF_ORGVAR record);

    int insertSelective(WF_ORGVAR record);

    WF_ORGVAR selectByPrimaryKey(WF_ORGVARKey key);

    int updateByPrimaryKeySelective(WF_ORGVAR record);

    int updateByPrimaryKey(WF_ORGVAR record);
}