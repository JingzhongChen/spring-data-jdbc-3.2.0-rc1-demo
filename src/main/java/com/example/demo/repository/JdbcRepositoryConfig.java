package com.example.demo.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories({
        "com.example.demo.repository"
})
public class JdbcRepositoryConfig extends AbstractJdbcConfiguration {
}
