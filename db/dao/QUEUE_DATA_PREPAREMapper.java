package com.bea.dao;

import com.bea.olp.QUEUE_DATA_PREPARE;

public interface QUEUE_DATA_PREPAREMapper {
    int insert(QUEUE_DATA_PREPARE record);

    int insertSelective(QUEUE_DATA_PREPARE record);
}