package com.bea.dao;

import com.bea.olp.WFI_SIGN_CONF;

public interface WFI_SIGN_CONFMapper {
    int deleteByPrimaryKey(String signId);

    int insert(WFI_SIGN_CONF record);

    int insertSelective(WFI_SIGN_CONF record);

    WFI_SIGN_CONF selectByPrimaryKey(String signId);

    int updateByPrimaryKeySelective(WFI_SIGN_CONF record);

    int updateByPrimaryKey(WFI_SIGN_CONF record);
}