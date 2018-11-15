package com.bea.dao;

import com.bea.olp.BIZ_RULE_RESULT;
import com.bea.olp.BIZ_RULE_RESULTKey;

public interface BIZ_RULE_RESULTMapper {
    int deleteByPrimaryKey(BIZ_RULE_RESULTKey key);

    int insert(BIZ_RULE_RESULT record);

    int insertSelective(BIZ_RULE_RESULT record);

    BIZ_RULE_RESULT selectByPrimaryKey(BIZ_RULE_RESULTKey key);

    int updateByPrimaryKeySelective(BIZ_RULE_RESULT record);

    int updateByPrimaryKey(BIZ_RULE_RESULT record);
}