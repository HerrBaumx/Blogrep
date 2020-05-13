package com.jxiao.controller;


import com.jxiao.common.lang.Result;
import com.jxiao.utils.RedisUtil;
import javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.jxiao.controller.BaseController;

import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JXiao
 * @since 2020-05-07
 */
@RestController
@RequestMapping("/post")
public class PostController extends BaseController {

    @Autowired
    RedisUtil redisUtil;

    @ResponseBody
    public Result hotPost() {
       Set<ZSetOperations.TypedTuple> lastWeekRank= redisUtil.getZSetRank("last_week_rank", 0, 6);
        List<Map<String, Object>> hotPosts = new ArrayList<>();
        for (ZSetOperations.TypedTuple typedTuple:lastWeekRank) {
            Map<String, Object> map = new HashMap<>();
            map.put("comment_count", typedTuple.getScore());
            map.put("id", redisUtil.hget("rank_post_" + typedTuple.getValue(), "post:id"));
            map.put("title", redisUtil.hget("rank_post_" + typedTuple.getValue(), "post:title"));
            hotPosts.add(map);
        }
        return Result.succ(hotPosts);
    }

}
