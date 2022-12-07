package com.zjn.lvyuan.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 20:29:39
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

