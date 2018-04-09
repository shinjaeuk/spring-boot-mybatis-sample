package com.ohmyplay.common.config;

import com.ohmyplay.common.filter.OhMyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new OhMyFilter());
        registrationBean.addUrlPatterns("/*");

        return registrationBean;
    }

}
