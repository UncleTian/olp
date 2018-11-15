package com.bea.dao;

import com.bea.olp.WF_COMMENT_EXT;

public interface WF_COMMENT_EXTMapper {
    int deleteByPrimaryKey(String commentid);

    int insert(WF_COMMENT_EXT record);

    int insertSelective(WF_COMMENT_EXT record);

    WF_COMMENT_EXT selectByPrimaryKey(String commentid);

    int updateByPrimaryKeySelective(WF_COMMENT_EXT record);

    int updateByPrimaryKey(WF_COMMENT_EXT record);
}