package com.magicvalleyworks.learning.simpleblogapp.service.api;

import com.magicvalleyworks.learning.simpleblogapp.dto.BlogPost;

import java.util.List;

public interface ILocalBlogPostBean {
    void addBlogPost(BlogPost blogPost);
    List<BlogPost> getBlogPosts();
}
