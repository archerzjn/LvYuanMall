package com.zjn.lvyuan.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-04 18:01:58
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

