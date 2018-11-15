package com.bea.dao;

import com.bea.olp.S_LOGWithBLOBs;

public interface S_LOGMapper {
    int insert(S_LOGWithBLOBs record);

    int insertSelective(S_LOGWithBLOBs record);
}