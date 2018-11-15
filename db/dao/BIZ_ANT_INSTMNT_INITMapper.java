package com.bea.dao;

import com.bea.olp.BIZ_ANT_INSTMNT_INIT;
import com.bea.olp.BIZ_ANT_INSTMNT_INITKey;

public interface BIZ_ANT_INSTMNT_INITMapper {
    int deleteByPrimaryKey(BIZ_ANT_INSTMNT_INITKey key);

    int insert(BIZ_ANT_INSTMNT_INIT record);

    int insertSelective(BIZ_ANT_INSTMNT_INIT record);

    BIZ_ANT_INSTMNT_INIT selectByPrimaryKey(BIZ_ANT_INSTMNT_INITKey key);

    int updateByPrimaryKeySelective(BIZ_ANT_INSTMNT_INIT record);

    int updateByPrimaryKey(BIZ_ANT_INSTMNT_INIT record);
}