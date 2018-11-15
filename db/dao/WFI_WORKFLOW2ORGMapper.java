package com.bea.dao;

import com.bea.olp.WFI_WORKFLOW2ORG;

public interface WFI_WORKFLOW2ORGMapper {
    int deleteByPrimaryKey(String wf2orgId);

    int insert(WFI_WORKFLOW2ORG record);

    int insertSelective(WFI_WORKFLOW2ORG record);

    WFI_WORKFLOW2ORG selectByPrimaryKey(String wf2orgId);

    int updateByPrimaryKeySelective(WFI_WORKFLOW2ORG record);

    int updateByPrimaryKey(WFI_WORKFLOW2ORG record);
}