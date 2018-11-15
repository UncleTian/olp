package com.bea.dao;

import com.bea.olp.WFI_MSG_QUEUE;

public interface WFI_MSG_QUEUEMapper {
    int deleteByPrimaryKey(String msgid);

    int insert(WFI_MSG_QUEUE record);

    int insertSelective(WFI_MSG_QUEUE record);

    WFI_MSG_QUEUE selectByPrimaryKey(String msgid);

    int updateByPrimaryKeySelective(WFI_MSG_QUEUE record);

    int updateByPrimaryKey(WFI_MSG_QUEUE record);
}