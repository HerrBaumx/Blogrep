package com.jxiao.service.impl;

import com.jxiao.entity.Category;
import com.jxiao.mapper.CategoryMapper;
import com.jxiao.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JXiao
 * @since 2020-05-07
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
