package com.bea.dao;

import com.bea.olp.WF_COMMENTEND;

public interface WF_COMMENTENDMapper {
    int deleteByPrimaryKey(String commentid);

    int insert(WF_COMMENTEND record);

    int insertSelective(WF_COMMENTEND record);

    WF_COMMENTEND selectByPrimaryKey(String commentid);

    int updateByPrimaryKeySelective(WF_COMMENTEND record);

    int updateByPrimaryKey(WF_COMMENTEND record);
}