package com.bea.dao;

import com.bea.olp.BIZ_HH_OCR_BACK_INFO;

public interface BIZ_HH_OCR_BACK_INFOMapper {
    int deleteByPrimaryKey(String id);

    int insert(BIZ_HH_OCR_BACK_INFO record);

    int insertSelective(BIZ_HH_OCR_BACK_INFO record);

    BIZ_HH_OCR_BACK_INFO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BIZ_HH_OCR_BACK_INFO record);

    int updateByPrimaryKey(BIZ_HH_OCR_BACK_INFO record);
}