package com.zjn.lvyuan.product.dao;

import com.zjn.lvyuan.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zjn
 * @email zjn28282@qq.com
 * @date 2022-12-07 20:32:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
