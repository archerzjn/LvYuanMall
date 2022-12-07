package com.zjn.lvyuan.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 18:23:21
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

