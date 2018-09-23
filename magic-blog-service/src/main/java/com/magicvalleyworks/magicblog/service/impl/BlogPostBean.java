package com.magicvalleyworks.magicblog.service.impl;

import com.magicvalleyworks.magicblog.dto.BlogPost;
import com.magicvalleyworks.magicblog.service.api.ILocalBlogPostBean;

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
