package com.bea.dao;

import com.bea.olp.CCR_G_IND_SCORE;
import com.bea.olp.CCR_G_IND_SCOREKey;

public interface CCR_G_IND_SCOREMapper {
    int deleteByPrimaryKey(CCR_G_IND_SCOREKey key);

    int insert(CCR_G_IND_SCORE record);

    int insertSelective(CCR_G_IND_SCORE record);

    CCR_G_IND_SCORE selectByPrimaryKey(CCR_G_IND_SCOREKey key);

    int updateByPrimaryKeySelective(CCR_G_IND_SCORE record);

    int updateByPrimaryKey(CCR_G_IND_SCORE record);
}