package com.zjn.lvyuan.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 20:32:24
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

