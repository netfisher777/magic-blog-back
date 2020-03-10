package com.magicvalleyworks.magicblog.web.controller;

import com.magicvalleyworks.magicblog.dto.BlogPost;
import com.magicvalleyworks.magicblog.service.api.ILocalBlogPostBean;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/blogPosts")
public class BlogPostsController {

    @EJB
    private ILocalBlogPostBean blogPostBean;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BlogPost> getBlogPosts() {
        return blogPostBean.getBlogPosts();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public BlogPost getBlogPost(@PathParam(value = "id") Integer id) {
        return blogPostBean.getBlogPost(id);
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public BlogPost addBlogPost(BlogPost blogPost) {
        return null;
    }

}
