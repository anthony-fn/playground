package com.anthony.playground.spring.mvc.config;

import java.util.regex.Pattern;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;


@Configuration
@Import(DataConfig.class)
@ComponentScan(basePackages={"com.anthony.playground.spring.mvc"},
    excludeFilters={
        @Filter(type=FilterType.CUSTOM, value=RootConfig.WebPackage.class)
    })
public class RootConfig {
  public static class WebPackage extends RegexPatternTypeFilter {
    public WebPackage() {
      super(Pattern.compile("com.anthony.playground.mvc\\.web"));
    }    
  }
}
