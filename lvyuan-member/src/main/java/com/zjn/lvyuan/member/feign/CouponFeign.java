package com.zjn.lvyuan.member.feign;

import com.zjn.lvyuan.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author paopaochahu
 */
@FeignClient("lvyuan-coupon")
public interface CouponFeign {

    @GetMapping("lvyuan/coupon/coupon/getCoupon")
    public R getCoupon();
}
