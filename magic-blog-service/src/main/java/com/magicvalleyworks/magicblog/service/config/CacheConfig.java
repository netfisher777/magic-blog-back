package com.magicvalleyworks.magicblog.service.config;

import org.infinispan.Cache;
import org.infinispan.manager.EmbeddedCacheManager;

import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

public class CacheConfig {

    @Produces
    @Dependent
    @Resource(lookup = "java:comp/env/container/blog")
    private EmbeddedCacheManager blogCacheManager;

    @Produces
    @Dependent
    @Resource(lookup = "java:comp/env/cache/blog/posts")
    private Cache<Object, Object> postsCache;

}
