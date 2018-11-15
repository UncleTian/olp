package com.bea.dao;

import com.bea.olp.WF_INSTANCE_END;

public interface WF_INSTANCE_ENDMapper {
    int deleteByPrimaryKey(String instanceid);

    int insert(WF_INSTANCE_END record);

    int insertSelective(WF_INSTANCE_END record);

    WF_INSTANCE_END selectByPrimaryKey(String instanceid);

    int updateByPrimaryKeySelective(WF_INSTANCE_END record);

    int updateByPrimaryKey(WF_INSTANCE_END record);
}