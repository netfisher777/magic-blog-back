package com.magicvalleyworks.magicblog.service.api;

import com.magicvalleyworks.magicblog.dto.BlogPost;

import java.util.List;

public interface ILocalBlogPostBean {
    void addBlogPost(BlogPost blogPost);
    List<BlogPost> getBlogPosts();
    BlogPost getBlogPost(Integer id);
}
