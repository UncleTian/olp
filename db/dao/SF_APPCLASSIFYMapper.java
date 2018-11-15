package com.bea.dao;

import com.bea.olp.SF_APPCLASSIFY;

public interface SF_APPCLASSIFYMapper {
    int deleteByPrimaryKey(String forder);

    int insert(SF_APPCLASSIFY record);

    int insertSelective(SF_APPCLASSIFY record);

    SF_APPCLASSIFY selectByPrimaryKey(String forder);

    int updateByPrimaryKeySelective(SF_APPCLASSIFY record);

    int updateByPrimaryKey(SF_APPCLASSIFY record);
}