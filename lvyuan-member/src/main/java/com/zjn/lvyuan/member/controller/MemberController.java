package com.zjn.lvyuan.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.zjn.lvyuan.member.feign.CouponFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zjn.lvyuan.member.entity.MemberEntity;
import com.zjn.lvyuan.member.service.MemberService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.common.utils.R;


/**
 * 会员
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 18:23:21
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    CouponFeign couponFeign;

    /**
     * feign测试
     *
     * @return
     */
    @GetMapping("memberCoupon")
    public R getMemberCoupon() {
        MemberEntity entity = new MemberEntity();
        entity.setNickname("狗剩");

        R coupon = couponFeign.getCoupon();
        return R.ok().put("member", entity).put("coupon", coupon.get("coupon"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id) {
        MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member) {
        memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member) {
        memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids) {
        memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
