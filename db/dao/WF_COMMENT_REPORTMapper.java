package com.bea.dao;

import com.bea.olp.WF_COMMENT_REPORT;

public interface WF_COMMENT_REPORTMapper {
    int deleteByPrimaryKey(String commentId);

    int insert(WF_COMMENT_REPORT record);

    int insertSelective(WF_COMMENT_REPORT record);

    WF_COMMENT_REPORT selectByPrimaryKey(String commentId);

    int updateByPrimaryKeySelective(WF_COMMENT_REPORT record);

    int updateByPrimaryKey(WF_COMMENT_REPORT record);
}