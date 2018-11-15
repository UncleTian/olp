package com.bea.dao;

import com.bea.olp.BAT_CBM_TRAN_INFO;

public interface BAT_CBM_TRAN_INFOMapper {
    int insert(BAT_CBM_TRAN_INFO record);

    int insertSelective(BAT_CBM_TRAN_INFO record);
}