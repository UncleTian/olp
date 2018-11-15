package com.bea.dao;

import com.bea.olp.BIZ_TD_CUSTOM_LIST;
import com.bea.olp.BIZ_TD_CUSTOM_LISTKey;

public interface BIZ_TD_CUSTOM_LISTMapper {
    int deleteByPrimaryKey(BIZ_TD_CUSTOM_LISTKey key);

    int insert(BIZ_TD_CUSTOM_LIST record);

    int insertSelective(BIZ_TD_CUSTOM_LIST record);

    BIZ_TD_CUSTOM_LIST selectByPrimaryKey(BIZ_TD_CUSTOM_LISTKey key);

    int updateByPrimaryKeySelective(BIZ_TD_CUSTOM_LIST record);

    int updateByPrimaryKey(BIZ_TD_CUSTOM_LIST record);
}