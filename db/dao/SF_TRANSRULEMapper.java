package com.bea.dao;

import com.bea.olp.SF_TRANSRULE;
import com.bea.olp.SF_TRANSRULEKey;

public interface SF_TRANSRULEMapper {
    int deleteByPrimaryKey(SF_TRANSRULEKey key);

    int insert(SF_TRANSRULE record);

    int insertSelective(SF_TRANSRULE record);

    SF_TRANSRULE selectByPrimaryKey(SF_TRANSRULEKey key);

    int updateByPrimaryKeySelective(SF_TRANSRULE record);

    int updateByPrimaryKey(SF_TRANSRULE record);
}