package com.bea.dao;

import com.bea.olp.CCR_M_GROUP_SCORE;
import com.bea.olp.CCR_M_GROUP_SCOREKey;

public interface CCR_M_GROUP_SCOREMapper {
    int deleteByPrimaryKey(CCR_M_GROUP_SCOREKey key);

    int insert(CCR_M_GROUP_SCORE record);

    int insertSelective(CCR_M_GROUP_SCORE record);

    CCR_M_GROUP_SCORE selectByPrimaryKey(CCR_M_GROUP_SCOREKey key);

    int updateByPrimaryKeySelective(CCR_M_GROUP_SCORE record);

    int updateByPrimaryKey(CCR_M_GROUP_SCORE record);
}