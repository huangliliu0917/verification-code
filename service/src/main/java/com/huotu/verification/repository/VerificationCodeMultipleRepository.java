/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2017. All rights reserved.
 */

package com.huotu.verification.repository;

import com.huotu.verification.entity.VerificationCodeMultiple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author CJ
 */
public interface VerificationCodeMultipleRepository extends JpaRepository<VerificationCodeMultiple, Long>
        , JpaSpecificationExecutor<VerificationCodeMultiple> {

    List<VerificationCodeMultiple> findByMobileAndType(String mobile, int type);
}
