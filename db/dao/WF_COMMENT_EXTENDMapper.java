package com.bea.dao;

import com.bea.olp.WF_COMMENT_EXTEND;

public interface WF_COMMENT_EXTENDMapper {
    int deleteByPrimaryKey(String commentid);

    int insert(WF_COMMENT_EXTEND record);

    int insertSelective(WF_COMMENT_EXTEND record);

    WF_COMMENT_EXTEND selectByPrimaryKey(String commentid);

    int updateByPrimaryKeySelective(WF_COMMENT_EXTEND record);

    int updateByPrimaryKey(WF_COMMENT_EXTEND record);
}