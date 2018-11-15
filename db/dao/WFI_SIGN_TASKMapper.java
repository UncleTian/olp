package com.bea.dao;

import com.bea.olp.WFI_SIGN_TASK;

public interface WFI_SIGN_TASKMapper {
    int deleteByPrimaryKey(String stTaskId);

    int insert(WFI_SIGN_TASK record);

    int insertSelective(WFI_SIGN_TASK record);

    WFI_SIGN_TASK selectByPrimaryKey(String stTaskId);

    int updateByPrimaryKeySelective(WFI_SIGN_TASK record);

    int updateByPrimaryKey(WFI_SIGN_TASK record);
}