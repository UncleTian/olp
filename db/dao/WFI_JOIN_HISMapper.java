package com.bea.dao;

import com.bea.olp.WFI_JOIN_HIS;

public interface WFI_JOIN_HISMapper {
    int deleteByPrimaryKey(String instanceid);

    int insert(WFI_JOIN_HIS record);

    int insertSelective(WFI_JOIN_HIS record);

    WFI_JOIN_HIS selectByPrimaryKey(String instanceid);

    int updateByPrimaryKeySelective(WFI_JOIN_HIS record);

    int updateByPrimaryKey(WFI_JOIN_HIS record);
}