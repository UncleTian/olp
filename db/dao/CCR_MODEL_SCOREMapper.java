package com.bea.dao;

import com.bea.olp.CCR_MODEL_SCORE;
import com.bea.olp.CCR_MODEL_SCOREKey;

public interface CCR_MODEL_SCOREMapper {
    int deleteByPrimaryKey(CCR_MODEL_SCOREKey key);

    int insert(CCR_MODEL_SCORE record);

    int insertSelective(CCR_MODEL_SCORE record);

    CCR_MODEL_SCORE selectByPrimaryKey(CCR_MODEL_SCOREKey key);

    int updateByPrimaryKeySelective(CCR_MODEL_SCORE record);

    int updateByPrimaryKey(CCR_MODEL_SCORE record);
}