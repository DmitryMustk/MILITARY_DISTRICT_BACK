package com.example.military_district_back.repository;

import com.example.military_district_back.dto.LocationResponse;
import com.example.military_district_back.mapper.LocationMapper;
import com.example.military_district_back.model.Location;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.Optional;

@RegisterRowMapper(LocationMapper.class)
public interface LocationRepository {
    @SqlQuery("SELECT * FROM locations WHERE id = :id")
    Optional<Location> findById(@Bind("id") Long id);

    @SqlQuery("SELECT * FROM locations")
    List<Location> findAll();

    @SqlUpdate("INSERT INTO locations (name, latitude, longitude) VALUES (:name, :latitude, :longitude)")
    @GetGeneratedKeys
    Long insert(@Bind("name") String name, @Bind("latitude") Double latitude, @Bind("longitude") Double longitude);

    @SqlUpdate("DELETE FROM locations WHERE id = :id")
    void deleteById(@Bind("id") Long id);
}
