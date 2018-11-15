package com.bea.dao;

import com.bea.olp.WF_COMMENT_SUMMARY_REPORT;

public interface WF_COMMENT_SUMMARY_REPORTMapper {
    int deleteByPrimaryKey(String approCommentId);

    int insert(WF_COMMENT_SUMMARY_REPORT record);

    int insertSelective(WF_COMMENT_SUMMARY_REPORT record);

    WF_COMMENT_SUMMARY_REPORT selectByPrimaryKey(String approCommentId);

    int updateByPrimaryKeySelective(WF_COMMENT_SUMMARY_REPORT record);

    int updateByPrimaryKey(WF_COMMENT_SUMMARY_REPORT record);
}