package com.bea.dao;

import com.bea.olp.WF_APPEXT;

public interface WF_APPEXTMapper {
    int deleteByPrimaryKey(String instanceid);

    int insert(WF_APPEXT record);

    int insertSelective(WF_APPEXT record);

    WF_APPEXT selectByPrimaryKey(String instanceid);

    int updateByPrimaryKeySelective(WF_APPEXT record);

    int updateByPrimaryKey(WF_APPEXT record);
}