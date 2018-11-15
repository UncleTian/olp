package com.bea.dao;

import com.bea.olp.WF_COMMENT;

public interface WF_COMMENTMapper {
    int deleteByPrimaryKey(String commentid);

    int insert(WF_COMMENT record);

    int insertSelective(WF_COMMENT record);

    WF_COMMENT selectByPrimaryKey(String commentid);

    int updateByPrimaryKeySelective(WF_COMMENT record);

    int updateByPrimaryKey(WF_COMMENT record);
}