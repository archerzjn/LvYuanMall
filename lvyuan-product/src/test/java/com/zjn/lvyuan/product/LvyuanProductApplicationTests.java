package com.zjn.lvyuan.product;

import com.zjn.lvyuan.product.entity.BrandEntity;
import com.zjn.lvyuan.product.service.BrandService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LvyuanProductApplicationTests {


    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setLogo("绿缘");
        brandService.save(brandEntity);
    }

}
