package com.bea.dao;

import com.bea.olp.SYS_FILE_INFO;

public interface SYS_FILE_INFOMapper {
    int deleteByPrimaryKey(String fileNo);

    int insert(SYS_FILE_INFO record);

    int insertSelective(SYS_FILE_INFO record);

    SYS_FILE_INFO selectByPrimaryKey(String fileNo);

    int updateByPrimaryKeySelective(SYS_FILE_INFO record);

    int updateByPrimaryKey(SYS_FILE_INFO record);
}