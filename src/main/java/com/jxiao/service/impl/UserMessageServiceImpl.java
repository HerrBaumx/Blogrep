package com.jxiao.service.impl;

import com.jxiao.entity.UserMessage;
import com.jxiao.mapper.UserMessageMapper;
import com.jxiao.service.UserMessageService;
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
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements UserMessageService {

}
