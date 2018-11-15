package com.bea.dao;

import com.bea.olp.CFG_FILE_INFO;

public interface CFG_FILE_INFOMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(CFG_FILE_INFO record);

    int insertSelective(CFG_FILE_INFO record);

    CFG_FILE_INFO selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(CFG_FILE_INFO record);

    int updateByPrimaryKey(CFG_FILE_INFO record);
}