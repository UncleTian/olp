package com.bea.dao;

import com.bea.olp.SF_CONSTANT;

public interface SF_CONSTANTMapper {
    int deleteByPrimaryKey(String constantId);

    int insert(SF_CONSTANT record);

    int insertSelective(SF_CONSTANT record);

    SF_CONSTANT selectByPrimaryKey(String constantId);

    int updateByPrimaryKeySelective(SF_CONSTANT record);

    int updateByPrimaryKey(SF_CONSTANT record);
}