package com.zjn.lvyuan.coupon.dao;

import com.zjn.lvyuan.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-04 18:01:59
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
