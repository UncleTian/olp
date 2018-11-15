package com.bea.dao;

import com.bea.olp.S_RESC_ACT;
import com.bea.olp.S_RESC_ACTKey;

public interface S_RESC_ACTMapper {
    int deleteByPrimaryKey(S_RESC_ACTKey key);

    int insert(S_RESC_ACT record);

    int insertSelective(S_RESC_ACT record);

    S_RESC_ACT selectByPrimaryKey(S_RESC_ACTKey key);

    int updateByPrimaryKeySelective(S_RESC_ACT record);

    int updateByPrimaryKey(S_RESC_ACT record);
}