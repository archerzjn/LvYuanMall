package com.zjn.lvyuan.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 20:32:24
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

