package com.bea.dao;

import com.bea.olp.REQUEST_DATA_REMARK_JD;
import com.bea.olp.REQUEST_DATA_REMARK_JDWithBLOBs;

public interface REQUEST_DATA_REMARK_JDMapper {
    int deleteByPrimaryKey(String requestNo);

    int insert(REQUEST_DATA_REMARK_JDWithBLOBs record);

    int insertSelective(REQUEST_DATA_REMARK_JDWithBLOBs record);

    REQUEST_DATA_REMARK_JDWithBLOBs selectByPrimaryKey(String requestNo);

    int updateByPrimaryKeySelective(REQUEST_DATA_REMARK_JDWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(REQUEST_DATA_REMARK_JDWithBLOBs record);

    int updateByPrimaryKey(REQUEST_DATA_REMARK_JD record);
}