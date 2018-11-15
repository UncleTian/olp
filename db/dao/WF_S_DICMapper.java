package com.bea.dao;

import com.bea.olp.WF_S_DIC;
import com.bea.olp.WF_S_DICKey;

public interface WF_S_DICMapper {
    int deleteByPrimaryKey(WF_S_DICKey key);

    int insert(WF_S_DIC record);

    int insertSelective(WF_S_DIC record);

    WF_S_DIC selectByPrimaryKey(WF_S_DICKey key);

    int updateByPrimaryKeySelective(WF_S_DIC record);

    int updateByPrimaryKey(WF_S_DIC record);
}