package com.magicvalleyworks.learning.simpleblogapp.service.impl;

import com.magicvalleyworks.learning.simpleblogapp.dto.BlogPost;
import com.magicvalleyworks.learning.simpleblogapp.service.api.ILocalBlogPostBean;

import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Local(value = ILocalBlogPostBean.class)
public class BlogPostBean implements ILocalBlogPostBean {

    public void addBlogPost(BlogPost blogPost) {

    }

    public List<BlogPost> getBlogPosts() {
        List<BlogPost> list = new ArrayList<BlogPost>();
        list.add(new BlogPost().setId(1)
                               .setMessage("Test1")
                               .setAuthor("Denis"));
        return list;
    }

}
