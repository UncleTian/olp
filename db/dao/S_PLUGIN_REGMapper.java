package com.bea.dao;

import com.bea.olp.S_PLUGIN_REG;

public interface S_PLUGIN_REGMapper {
    int deleteByPrimaryKey(String pluginModuleId);

    int insert(S_PLUGIN_REG record);

    int insertSelective(S_PLUGIN_REG record);

    S_PLUGIN_REG selectByPrimaryKey(String pluginModuleId);

    int updateByPrimaryKeySelective(S_PLUGIN_REG record);

    int updateByPrimaryKey(S_PLUGIN_REG record);
}