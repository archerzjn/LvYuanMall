package com.zjn.lvyuan.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 18:23:21
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

