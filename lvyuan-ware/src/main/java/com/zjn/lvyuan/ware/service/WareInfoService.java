package com.zjn.lvyuan.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 20:49:08
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

