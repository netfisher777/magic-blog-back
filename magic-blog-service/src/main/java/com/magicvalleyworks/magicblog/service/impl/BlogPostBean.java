package com.magicvalleyworks.magicblog.service.impl;

import com.magicvalleyworks.magicblog.dto.BlogPost;
import com.magicvalleyworks.magicblog.service.api.ILocalBlogPostBean;
import com.magicvalleyworks.magicblog.service.mockstore.BlogPostsMockStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.cache.annotation.CacheResult;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Stateless(name = "BlogPostBean")
@Local(value = ILocalBlogPostBean.class)
public class BlogPostBean implements ILocalBlogPostBean {

    private static final Logger logger = LoggerFactory.getLogger(BlogPostBean.class);

    @Inject
    private BlogPostsMockStore blogPostsMockStore;

    public void addBlogPost(BlogPost blogPost) {

    }

    public List<BlogPost> getBlogPosts() {
        List<BlogPost> list = new ArrayList<BlogPost>();
        list.add(new BlogPost().setId(1)
                               .setMessage("Test1")
                               .setAuthor("Denis"));
        return list;
    }

    @CacheResult(cacheName = "posts")
    @Override
    public BlogPost getBlogPost(Integer id) {
        logger.info(String.format("!!!!!!!!!!!!!!!!**********Getting data #%d from mock**********!!!!!!!!!!!!!!!!", id));
        BlogPost blogPost = blogPostsMockStore.getBlogPost(id);
        return blogPost;
    }
}
