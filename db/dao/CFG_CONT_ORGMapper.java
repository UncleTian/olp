package com.bea.dao;

import com.bea.olp.CFG_CONT_ORG;

public interface CFG_CONT_ORGMapper {
    int deleteByPrimaryKey(String contTextOrg);

    int insert(CFG_CONT_ORG record);

    int insertSelective(CFG_CONT_ORG record);

    CFG_CONT_ORG selectByPrimaryKey(String contTextOrg);

    int updateByPrimaryKeySelective(CFG_CONT_ORG record);

    int updateByPrimaryKey(CFG_CONT_ORG record);
}