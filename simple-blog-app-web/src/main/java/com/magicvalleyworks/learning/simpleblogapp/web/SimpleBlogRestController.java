package com.magicvalleyworks.learning.simpleblogapp.web;

import com.magicvalleyworks.learning.simpleblogapp.dto.BlogPost;
import com.magicvalleyworks.learning.simpleblogapp.service.api.ILocalBlogPostBean;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class SimpleBlogRestController {

    @EJB
    private ILocalBlogPostBean blogPostBean;

    @GET
    @Path("/posts")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BlogPost> getPosts() {
        return blogPostBean.getBlogPosts();
    }

}
