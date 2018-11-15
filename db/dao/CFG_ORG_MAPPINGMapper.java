package com.bea.dao;

import com.bea.olp.CFG_ORG_MAPPING;

public interface CFG_ORG_MAPPINGMapper {
    int deleteByPrimaryKey(String manageOrgId);

    int insert(CFG_ORG_MAPPING record);

    int insertSelective(CFG_ORG_MAPPING record);

    CFG_ORG_MAPPING selectByPrimaryKey(String manageOrgId);

    int updateByPrimaryKeySelective(CFG_ORG_MAPPING record);

    int updateByPrimaryKey(CFG_ORG_MAPPING record);
}