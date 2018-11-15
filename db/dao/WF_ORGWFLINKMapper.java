package com.bea.dao;

import com.bea.olp.WF_ORGWFLINK;

public interface WF_ORGWFLINKMapper {
    int deleteByPrimaryKey(String unid);

    int insert(WF_ORGWFLINK record);

    int insertSelective(WF_ORGWFLINK record);

    WF_ORGWFLINK selectByPrimaryKey(String unid);

    int updateByPrimaryKeySelective(WF_ORGWFLINK record);

    int updateByPrimaryKey(WF_ORGWFLINK record);
}