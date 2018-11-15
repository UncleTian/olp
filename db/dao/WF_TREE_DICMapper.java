package com.bea.dao;

import com.bea.olp.WF_TREE_DIC;

public interface WF_TREE_DICMapper {
    int deleteByPrimaryKey(String itempk);

    int insert(WF_TREE_DIC record);

    int insertSelective(WF_TREE_DIC record);

    WF_TREE_DIC selectByPrimaryKey(String itempk);

    int updateByPrimaryKeySelective(WF_TREE_DIC record);

    int updateByPrimaryKey(WF_TREE_DIC record);
}