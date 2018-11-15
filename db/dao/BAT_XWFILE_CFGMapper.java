package com.bea.dao;

import com.bea.olp.BAT_XWFILE_CFG;

public interface BAT_XWFILE_CFGMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(BAT_XWFILE_CFG record);

    int insertSelective(BAT_XWFILE_CFG record);

    BAT_XWFILE_CFG selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(BAT_XWFILE_CFG record);

    int updateByPrimaryKey(BAT_XWFILE_CFG record);
}