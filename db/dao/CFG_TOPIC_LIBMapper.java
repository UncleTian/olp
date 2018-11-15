package com.bea.dao;

import com.bea.olp.CFG_TOPIC_LIB;

public interface CFG_TOPIC_LIBMapper {
    int deleteByPrimaryKey(String questionNo);

    int insert(CFG_TOPIC_LIB record);

    int insertSelective(CFG_TOPIC_LIB record);

    CFG_TOPIC_LIB selectByPrimaryKey(String questionNo);

    int updateByPrimaryKeySelective(CFG_TOPIC_LIB record);

    int updateByPrimaryKey(CFG_TOPIC_LIB record);
}