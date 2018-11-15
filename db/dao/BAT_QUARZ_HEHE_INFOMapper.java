package com.bea.dao;

import com.bea.olp.BAT_QUARZ_HEHE_INFO;

public interface BAT_QUARZ_HEHE_INFOMapper {
    int deleteByPrimaryKey(String loanNo);

    int insert(BAT_QUARZ_HEHE_INFO record);

    int insertSelective(BAT_QUARZ_HEHE_INFO record);

    BAT_QUARZ_HEHE_INFO selectByPrimaryKey(String loanNo);

    int updateByPrimaryKeySelective(BAT_QUARZ_HEHE_INFO record);

    int updateByPrimaryKey(BAT_QUARZ_HEHE_INFO record);
}