package com.hspedu.hspliving.commodity.dao;

import com.hspedu.hspliving.commodity.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品分类表
 * 
 * @author fraven
 * @email fraven@gmail.com
 * @date 2022-12-04 16:28:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
