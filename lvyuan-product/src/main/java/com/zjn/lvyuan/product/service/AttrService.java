package com.zjn.lvyuan.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 20:32:25
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

