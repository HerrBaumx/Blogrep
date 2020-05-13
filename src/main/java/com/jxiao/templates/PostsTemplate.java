package com.jxiao.templates;

import com.jxiao.common.template.DirectiveHandler;
import com.jxiao.common.template.TemplateDirective;
import org.springframework.stereotype.Component;

@Component
public class PostsTemplate extends TemplateDirective {

    @Override
    public String getName() {
        return "posts";
    }

    @Override
    public void execute(DirectiveHandler handler) throws Exception {


        Long categoryId=handler.getLong("categoryId", 0);
        handler.getInteger("pn", 1);
    }
}
