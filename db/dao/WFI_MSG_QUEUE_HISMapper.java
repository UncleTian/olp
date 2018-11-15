package com.bea.dao;

import com.bea.olp.WFI_MSG_QUEUE_HIS;

public interface WFI_MSG_QUEUE_HISMapper {
    int deleteByPrimaryKey(String msgid);

    int insert(WFI_MSG_QUEUE_HIS record);

    int insertSelective(WFI_MSG_QUEUE_HIS record);

    WFI_MSG_QUEUE_HIS selectByPrimaryKey(String msgid);

    int updateByPrimaryKeySelective(WFI_MSG_QUEUE_HIS record);

    int updateByPrimaryKey(WFI_MSG_QUEUE_HIS record);
}