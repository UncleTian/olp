package com.bea.dao;

import com.bea.olp.BIZ_XW_FILE_NUM;

public interface BIZ_XW_FILE_NUMMapper {
    int deleteByPrimaryKey(String fileDate);

    int insert(BIZ_XW_FILE_NUM record);

    int insertSelective(BIZ_XW_FILE_NUM record);

    BIZ_XW_FILE_NUM selectByPrimaryKey(String fileDate);

    int updateByPrimaryKeySelective(BIZ_XW_FILE_NUM record);

    int updateByPrimaryKey(BIZ_XW_FILE_NUM record);
}