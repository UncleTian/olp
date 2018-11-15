package com.bea.dao;

import com.bea.olp.BIZ_HH_OCR_PARM;

public interface BIZ_HH_OCR_PARMMapper {
    int deleteByPrimaryKey(String id);

    int insert(BIZ_HH_OCR_PARM record);

    int insertSelective(BIZ_HH_OCR_PARM record);

    BIZ_HH_OCR_PARM selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BIZ_HH_OCR_PARM record);

    int updateByPrimaryKeyWithBLOBs(BIZ_HH_OCR_PARM record);

    int updateByPrimaryKey(BIZ_HH_OCR_PARM record);
}