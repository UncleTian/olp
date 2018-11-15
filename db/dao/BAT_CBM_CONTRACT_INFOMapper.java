package com.bea.dao;

import com.bea.olp.BAT_CBM_CONTRACT_INFO;

public interface BAT_CBM_CONTRACT_INFOMapper {
    int insert(BAT_CBM_CONTRACT_INFO record);

    int insertSelective(BAT_CBM_CONTRACT_INFO record);
}