package com.zjn.lvyuan.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.zjn.lvyuan.coupon.entity.CouponEntity;
import com.zjn.lvyuan.coupon.service.CouponService;
import com.zjn.lvyuan.common.utils.PageUtils;
import com.zjn.lvyuan.common.utils.R;


/**
 * 优惠券信息
 *
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-04 18:11:20
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value("${coupon.name:zjn}")
    public String name;
    @Value("${coupon.age:20}")
    public String age;

    @GetMapping("/test")
    public R test() {
        return R.ok().put("name", name).put("age", age);
    }

    @GetMapping("getCoupon")
    public R getCoupon() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减99");
        return R.ok().put("coupon", couponEntity);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id) {
        CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon) {
        couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon) {
        couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids) {
        couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
