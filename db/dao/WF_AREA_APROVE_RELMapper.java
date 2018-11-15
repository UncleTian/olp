package com.bea.dao;

import com.bea.olp.WF_AREA_APROVE_REL;

public interface WF_AREA_APROVE_RELMapper {
    int deleteByPrimaryKey(String id);

    int insert(WF_AREA_APROVE_REL record);

    int insertSelective(WF_AREA_APROVE_REL record);

    WF_AREA_APROVE_REL selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WF_AREA_APROVE_REL record);

    int updateByPrimaryKey(WF_AREA_APROVE_REL record);
}