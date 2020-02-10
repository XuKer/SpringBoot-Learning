package com.xuke.EnvironmentORApplicationContext;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.io.IOException;
import java.util.List;


/**
 * @Author: XuKe
 * @CreateOn:2020-02-10 20:49
 * @Email ：wxk1035@gmail.com
 */

public class YamlEnvironmentPostProcessor implements EnvironmentPostProcessor {
    private final YamlPropertySourceLoader loader = new YamlPropertySourceLoader();

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Resource path = new ClassPathResource("config/config.yml");
        List<PropertySource<?>> propertySource = loadYaml(path);

        environment.getPropertySources().addLast(propertySource.get(0));
    }

    private List<PropertySource<?>> loadYaml(Resource path) {
        if (!path.exists()) {
            throw new IllegalArgumentException("Resource " + path + " does not exist");
        }
        try {
            return  this.loader.load("customConfig：[classpath:/config/config.yml]", path);

        } catch (IOException ex) {
            throw new IllegalStateException("Failed to load yaml configuration from " + path, ex);
        }
    }
}