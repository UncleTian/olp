package com.bea.dao;

import com.bea.olp.BIZ_PY_NAME_PERSON_INFO;

public interface BIZ_PY_NAME_PERSON_INFOMapper {
    int deleteByPrimaryKey(String appNo);

    int insert(BIZ_PY_NAME_PERSON_INFO record);

    int insertSelective(BIZ_PY_NAME_PERSON_INFO record);

    BIZ_PY_NAME_PERSON_INFO selectByPrimaryKey(String appNo);

    int updateByPrimaryKeySelective(BIZ_PY_NAME_PERSON_INFO record);

    int updateByPrimaryKey(BIZ_PY_NAME_PERSON_INFO record);
}