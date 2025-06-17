package com.example.military_district_back.config;

import com.example.military_district_back.mapper.GeneralAttributesMapper;
import com.example.military_district_back.mapper.LocationMapper;
import com.example.military_district_back.mapper.MilitaryUnitMapper;
import com.example.military_district_back.mapper.PersonnelMapper;
import com.example.military_district_back.repository.LocationRepository;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
public class JdbiConfig {
    @Bean
    public Jdbi jdbi(DataSource dataSource) {
        Jdbi jdbi = Jdbi.create(dataSource).installPlugin(new SqlObjectPlugin());

        jdbi.registerRowMapper(new MilitaryUnitMapper());
        jdbi.registerRowMapper(new PersonnelMapper());
        jdbi.registerRowMapper(new GeneralAttributesMapper());
        jdbi.registerRowMapper(new LocationMapper());

        return jdbi;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public LocationRepository locationRepository(Jdbi jdbi) {
        return jdbi.onDemand(LocationRepository.class);
    }
}
