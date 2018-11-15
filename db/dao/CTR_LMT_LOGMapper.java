package com.bea.dao;

import com.bea.olp.CTR_LMT_LOG;

public interface CTR_LMT_LOGMapper {
    int deleteByPrimaryKey(String serno);

    int insert(CTR_LMT_LOG record);

    int insertSelective(CTR_LMT_LOG record);

    CTR_LMT_LOG selectByPrimaryKey(String serno);

    int updateByPrimaryKeySelective(CTR_LMT_LOG record);

    int updateByPrimaryKey(CTR_LMT_LOG record);
}