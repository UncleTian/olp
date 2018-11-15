package com.bea.dao;

import com.bea.olp.RPT_FIVE_CLASSIFY;

public interface RPT_FIVE_CLASSIFYMapper {
    int deleteByPrimaryKey(String seralNo);

    int insert(RPT_FIVE_CLASSIFY record);

    int insertSelective(RPT_FIVE_CLASSIFY record);

    RPT_FIVE_CLASSIFY selectByPrimaryKey(String seralNo);

    int updateByPrimaryKeySelective(RPT_FIVE_CLASSIFY record);

    int updateByPrimaryKey(RPT_FIVE_CLASSIFY record);
}