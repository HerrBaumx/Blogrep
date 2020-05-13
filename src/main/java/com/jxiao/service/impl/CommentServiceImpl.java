package com.jxiao.service.impl;

import com.jxiao.entity.Comment;
import com.jxiao.mapper.CommentMapper;
import com.jxiao.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
