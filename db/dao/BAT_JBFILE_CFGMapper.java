package com.bea.dao;

import com.bea.olp.BAT_JBFILE_CFG;

public interface BAT_JBFILE_CFGMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(BAT_JBFILE_CFG record);

    int insertSelective(BAT_JBFILE_CFG record);

    BAT_JBFILE_CFG selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(BAT_JBFILE_CFG record);

    int updateByPrimaryKey(BAT_JBFILE_CFG record);
}