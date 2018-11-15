package com.bea.dao;

import com.bea.olp.WF_STUDIO;
import java.math.BigDecimal;

public interface WF_STUDIOMapper {
    int deleteByPrimaryKey(BigDecimal wfid);

    int insert(WF_STUDIO record);

    int insertSelective(WF_STUDIO record);

    WF_STUDIO selectByPrimaryKey(BigDecimal wfid);

    int updateByPrimaryKeySelective(WF_STUDIO record);

    int updateByPrimaryKey(WF_STUDIO record);
}