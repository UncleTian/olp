package com.bea.olp.ant.repository;

import com.bea.olp.ant.entity.AntRatFirstAppInfo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * AntRatFirstAppInfoRepo
 */
public interface AntRatFirstAppInfoRepo extends JpaRepository<AntRatFirstAppInfo,Long>{

    AntRatFirstAppInfo save(AntRatFirstAppInfo antRatFirstAppInfo);
}