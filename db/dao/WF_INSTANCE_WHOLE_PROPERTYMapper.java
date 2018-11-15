package com.bea.dao;

import com.bea.olp.WF_INSTANCE_WHOLE_PROPERTY;

public interface WF_INSTANCE_WHOLE_PROPERTYMapper {
    int deleteByPrimaryKey(String instanceid);

    int insert(WF_INSTANCE_WHOLE_PROPERTY record);

    int insertSelective(WF_INSTANCE_WHOLE_PROPERTY record);

    WF_INSTANCE_WHOLE_PROPERTY selectByPrimaryKey(String instanceid);

    int updateByPrimaryKeySelective(WF_INSTANCE_WHOLE_PROPERTY record);

    int updateByPrimaryKey(WF_INSTANCE_WHOLE_PROPERTY record);
}