package com.jxiao.service;

import com.jxiao.entity.Post;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author JXiao
 * @since 2020-05-07
 */
public interface PostService extends IService<Post> {

    Post get(long id);

    boolean update(Post post);

    boolean delete(long id);

    void initIndexWeekRank();

    void zUnionAndStoreLast7DaysForLastWeekRank();

    void incrZsetValueAndUnionForLastWeekRank(Long postId);

}
