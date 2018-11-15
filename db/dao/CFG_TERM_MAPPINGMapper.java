package com.bea.dao;

import com.bea.olp.CFG_TERM_MAPPING;

public interface CFG_TERM_MAPPINGMapper {
    int insert(CFG_TERM_MAPPING record);

    int insertSelective(CFG_TERM_MAPPING record);
}