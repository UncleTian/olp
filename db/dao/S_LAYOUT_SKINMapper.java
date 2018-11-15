package com.bea.dao;

import com.bea.olp.S_LAYOUT_SKIN;

public interface S_LAYOUT_SKINMapper {
    int deleteByPrimaryKey(String usrCde);

    int insert(S_LAYOUT_SKIN record);

    int insertSelective(S_LAYOUT_SKIN record);

    S_LAYOUT_SKIN selectByPrimaryKey(String usrCde);

    int updateByPrimaryKeySelective(S_LAYOUT_SKIN record);

    int updateByPrimaryKey(S_LAYOUT_SKIN record);
}