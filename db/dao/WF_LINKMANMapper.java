package com.bea.dao;

import com.bea.olp.WF_LINKMAN;
import com.bea.olp.WF_LINKMANKey;

public interface WF_LINKMANMapper {
    int deleteByPrimaryKey(WF_LINKMANKey key);

    int insert(WF_LINKMAN record);

    int insertSelective(WF_LINKMAN record);

    WF_LINKMAN selectByPrimaryKey(WF_LINKMANKey key);

    int updateByPrimaryKeySelective(WF_LINKMAN record);

    int updateByPrimaryKey(WF_LINKMAN record);
}