package com.bea.dao;

import com.bea.olp.SF_TRANS;

public interface SF_TRANSMapper {
    int deleteByPrimaryKey(String transId);

    int insert(SF_TRANS record);

    int insertSelective(SF_TRANS record);

    SF_TRANS selectByPrimaryKey(String transId);

    int updateByPrimaryKeySelective(SF_TRANS record);

    int updateByPrimaryKey(SF_TRANS record);
}