package com.bea.dao;

import com.bea.olp.WFI_SIGN_VOTE;

public interface WFI_SIGN_VOTEMapper {
    int deleteByPrimaryKey(String svVoteId);

    int insert(WFI_SIGN_VOTE record);

    int insertSelective(WFI_SIGN_VOTE record);

    WFI_SIGN_VOTE selectByPrimaryKey(String svVoteId);

    int updateByPrimaryKeySelective(WFI_SIGN_VOTE record);

    int updateByPrimaryKey(WFI_SIGN_VOTE record);
}