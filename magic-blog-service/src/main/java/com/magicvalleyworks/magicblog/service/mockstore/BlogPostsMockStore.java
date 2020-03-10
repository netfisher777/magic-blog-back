package com.magicvalleyworks.magicblog.service.mockstore;

import com.magicvalleyworks.magicblog.dto.BlogPost;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class BlogPostsMockStore {

    private Map<Integer, BlogPost> blogPostMap;

    @PostConstruct
    private void init() {
        blogPostMap = new HashMap<>();

        for (int i = 1; i <= 1000; i++) {
            blogPostMap.put(i, new BlogPost().setId(i)
                                             .setAuthor(String.format("Test%d", i))
                                             .setMessage(String.format("Message #%d", i)));
        }
    }

    public BlogPost getBlogPost(Integer id) {
        return blogPostMap.get(id);
    }

}
