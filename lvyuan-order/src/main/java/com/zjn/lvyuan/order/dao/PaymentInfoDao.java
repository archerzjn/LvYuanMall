package com.zjn.lvyuan.order.dao;

import com.zjn.lvyuan.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 20:29:39
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
