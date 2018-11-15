package com.bea.dao;

import com.bea.olp.WF_TASKPOOL_CONFIGKey;

public interface WF_TASKPOOL_CONFIGMapper {
    int deleteByPrimaryKey(WF_TASKPOOL_CONFIGKey key);

    int insert(WF_TASKPOOL_CONFIGKey record);

    int insertSelective(WF_TASKPOOL_CONFIGKey record);
}