package com.zjn.lvyuan.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 20:49:08
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

