package com.bea.dao;

import com.bea.olp.BIZ_TD_GREY_LIST;
import com.bea.olp.BIZ_TD_GREY_LISTKey;

public interface BIZ_TD_GREY_LISTMapper {
    int deleteByPrimaryKey(BIZ_TD_GREY_LISTKey key);

    int insert(BIZ_TD_GREY_LIST record);

    int insertSelective(BIZ_TD_GREY_LIST record);

    BIZ_TD_GREY_LIST selectByPrimaryKey(BIZ_TD_GREY_LISTKey key);

    int updateByPrimaryKeySelective(BIZ_TD_GREY_LIST record);

    int updateByPrimaryKey(BIZ_TD_GREY_LIST record);
}