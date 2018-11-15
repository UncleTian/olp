package com.bea.dao;

import com.bea.olp.S_MSG;

public interface S_MSGMapper {
    int deleteByPrimaryKey(String msgCde);

    int insert(S_MSG record);

    int insertSelective(S_MSG record);

    S_MSG selectByPrimaryKey(String msgCde);

    int updateByPrimaryKeySelective(S_MSG record);

    int updateByPrimaryKey(S_MSG record);
}