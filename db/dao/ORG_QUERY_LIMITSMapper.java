package com.bea.dao;

import com.bea.olp.ORG_QUERY_LIMITS;

public interface ORG_QUERY_LIMITSMapper {
    int deleteByPrimaryKey(String bchCde);

    int insert(ORG_QUERY_LIMITS record);

    int insertSelective(ORG_QUERY_LIMITS record);

    ORG_QUERY_LIMITS selectByPrimaryKey(String bchCde);

    int updateByPrimaryKeySelective(ORG_QUERY_LIMITS record);

    int updateByPrimaryKey(ORG_QUERY_LIMITS record);
}