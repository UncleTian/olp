package com.bea.dao;

import com.bea.olp.RAT_SECOND_APP_INFO;
import com.bea.olp.RAT_SECOND_APP_INFOWithBLOBs;

public interface RAT_SECOND_APP_INFOMapper {
    int deleteByPrimaryKey(String tpNo);

    int insert(RAT_SECOND_APP_INFOWithBLOBs record);

    int insertSelective(RAT_SECOND_APP_INFOWithBLOBs record);

    RAT_SECOND_APP_INFOWithBLOBs selectByPrimaryKey(String tpNo);

    int updateByPrimaryKeySelective(RAT_SECOND_APP_INFOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RAT_SECOND_APP_INFOWithBLOBs record);

    int updateByPrimaryKey(RAT_SECOND_APP_INFO record);
}