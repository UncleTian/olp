package com.bea.dao;

import com.bea.olp.WF_WHOLE_PROPERTY;

public interface WF_WHOLE_PROPERTYMapper {
    int deleteByPrimaryKey(String wfid);

    int insert(WF_WHOLE_PROPERTY record);

    int insertSelective(WF_WHOLE_PROPERTY record);

    WF_WHOLE_PROPERTY selectByPrimaryKey(String wfid);

    int updateByPrimaryKeySelective(WF_WHOLE_PROPERTY record);

    int updateByPrimaryKey(WF_WHOLE_PROPERTY record);
}