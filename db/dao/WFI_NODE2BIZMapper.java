package com.bea.dao;

import com.bea.olp.WFI_NODE2BIZ;
import com.bea.olp.WFI_NODE2BIZKey;

public interface WFI_NODE2BIZMapper {
    int deleteByPrimaryKey(WFI_NODE2BIZKey key);

    int insert(WFI_NODE2BIZ record);

    int insertSelective(WFI_NODE2BIZ record);

    WFI_NODE2BIZ selectByPrimaryKey(WFI_NODE2BIZKey key);

    int updateByPrimaryKeySelective(WFI_NODE2BIZ record);

    int updateByPrimaryKey(WFI_NODE2BIZ record);
}