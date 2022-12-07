package com.zjn.lvyuan.order.dao;

import com.zjn.lvyuan.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 20:29:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
