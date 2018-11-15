package com.bea.dao;

import com.bea.olp.WF_INSTANCE_STATUS;

public interface WF_INSTANCE_STATUSMapper {
    int insert(WF_INSTANCE_STATUS record);

    int insertSelective(WF_INSTANCE_STATUS record);
}