package com.bea.dao;

import com.bea.olp.BIZ_RULE_PREPARE;
import com.bea.olp.BIZ_RULE_PREPAREKey;

public interface BIZ_RULE_PREPAREMapper {
    int deleteByPrimaryKey(BIZ_RULE_PREPAREKey key);

    int insert(BIZ_RULE_PREPARE record);

    int insertSelective(BIZ_RULE_PREPARE record);

    BIZ_RULE_PREPARE selectByPrimaryKey(BIZ_RULE_PREPAREKey key);

    int updateByPrimaryKeySelective(BIZ_RULE_PREPARE record);

    int updateByPrimaryKey(BIZ_RULE_PREPARE record);
}