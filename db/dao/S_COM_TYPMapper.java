package com.bea.dao;

import com.bea.olp.S_COM_TYP;

public interface S_COM_TYPMapper {
    int deleteByPrimaryKey(String comTyp);

    int insert(S_COM_TYP record);

    int insertSelective(S_COM_TYP record);

    S_COM_TYP selectByPrimaryKey(String comTyp);

    int updateByPrimaryKeySelective(S_COM_TYP record);

    int updateByPrimaryKey(S_COM_TYP record);
}