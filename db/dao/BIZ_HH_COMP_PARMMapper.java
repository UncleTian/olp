package com.bea.dao;

import com.bea.olp.BIZ_HH_COMP_PARM;

public interface BIZ_HH_COMP_PARMMapper {
    int deleteByPrimaryKey(String id);

    int insert(BIZ_HH_COMP_PARM record);

    int insertSelective(BIZ_HH_COMP_PARM record);

    BIZ_HH_COMP_PARM selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BIZ_HH_COMP_PARM record);

    int updateByPrimaryKeyWithBLOBs(BIZ_HH_COMP_PARM record);

    int updateByPrimaryKey(BIZ_HH_COMP_PARM record);
}