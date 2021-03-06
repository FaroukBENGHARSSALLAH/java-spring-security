package com.farouk.bengarssallah.java.spring.security.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfiguration
{
    @Bean
    public EmbeddedDatabase dataSource() {
        final EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        final EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2).build();
        return db;
    }

}
