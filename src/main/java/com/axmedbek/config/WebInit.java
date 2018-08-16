package com.axmedbek.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Nullable
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Nullable
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
