package com.bea.dao;

import com.bea.olp.WFI_JOIN;

public interface WFI_JOINMapper {
    int deleteByPrimaryKey(String instanceid);

    int insert(WFI_JOIN record);

    int insertSelective(WFI_JOIN record);

    WFI_JOIN selectByPrimaryKey(String instanceid);

    int updateByPrimaryKeySelective(WFI_JOIN record);

    int updateByPrimaryKey(WFI_JOIN record);
}