package com.bea.dao;

import com.bea.olp.WF_TXN_LOG;

public interface WF_TXN_LOGMapper {
    int deleteByPrimaryKey(String seqNo);

    int insert(WF_TXN_LOG record);

    int insertSelective(WF_TXN_LOG record);

    WF_TXN_LOG selectByPrimaryKey(String seqNo);

    int updateByPrimaryKeySelective(WF_TXN_LOG record);

    int updateByPrimaryKey(WF_TXN_LOG record);
}