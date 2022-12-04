package com.hspedu.hspliving.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hspedu.common.utils.PageUtils;
import com.hspedu.hspliving.commodity.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品分类表
 *
 * @author fraven
 * @email fraven@gmail.com
 * @date 2022-12-04 16:28:23
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

