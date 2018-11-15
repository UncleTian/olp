package com.bea.dao;

import com.bea.olp.S_COM_CDE;
import com.bea.olp.S_COM_CDEKey;

public interface S_COM_CDEMapper {
    int deleteByPrimaryKey(S_COM_CDEKey key);

    int insert(S_COM_CDE record);

    int insertSelective(S_COM_CDE record);

    S_COM_CDE selectByPrimaryKey(S_COM_CDEKey key);

    int updateByPrimaryKeySelective(S_COM_CDE record);

    int updateByPrimaryKey(S_COM_CDE record);
}