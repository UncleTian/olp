package com.bea.dao;

import com.bea.olp.PRO_INTERFACE_CONFIG;

public interface PRO_INTERFACE_CONFIGMapper {
    int deleteByPrimaryKey(String proCode);

    int insert(PRO_INTERFACE_CONFIG record);

    int insertSelective(PRO_INTERFACE_CONFIG record);

    PRO_INTERFACE_CONFIG selectByPrimaryKey(String proCode);

    int updateByPrimaryKeySelective(PRO_INTERFACE_CONFIG record);

    int updateByPrimaryKey(PRO_INTERFACE_CONFIG record);
}