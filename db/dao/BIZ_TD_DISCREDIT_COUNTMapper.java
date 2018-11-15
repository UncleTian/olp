package com.bea.dao;

import com.bea.olp.BIZ_TD_DISCREDIT_COUNT;
import com.bea.olp.BIZ_TD_DISCREDIT_COUNTKey;

public interface BIZ_TD_DISCREDIT_COUNTMapper {
    int deleteByPrimaryKey(BIZ_TD_DISCREDIT_COUNTKey key);

    int insert(BIZ_TD_DISCREDIT_COUNT record);

    int insertSelective(BIZ_TD_DISCREDIT_COUNT record);

    BIZ_TD_DISCREDIT_COUNT selectByPrimaryKey(BIZ_TD_DISCREDIT_COUNTKey key);

    int updateByPrimaryKeySelective(BIZ_TD_DISCREDIT_COUNT record);

    int updateByPrimaryKey(BIZ_TD_DISCREDIT_COUNT record);
}