package com.bea.dao;

import com.bea.olp.SF_RULECONSTANT;
import com.bea.olp.SF_RULECONSTANTKey;

public interface SF_RULECONSTANTMapper {
    int deleteByPrimaryKey(SF_RULECONSTANTKey key);

    int insert(SF_RULECONSTANT record);

    int insertSelective(SF_RULECONSTANT record);

    SF_RULECONSTANT selectByPrimaryKey(SF_RULECONSTANTKey key);

    int updateByPrimaryKeySelective(SF_RULECONSTANT record);

    int updateByPrimaryKey(SF_RULECONSTANT record);
}