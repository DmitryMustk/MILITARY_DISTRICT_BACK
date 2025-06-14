package com.example.military_district_back.repository;

import com.example.military_district_back.mapper.MilitaryUnitMapper;
import com.example.military_district_back.model.MilitaryUnit;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.Optional;

@RegisterRowMapper(MilitaryUnitMapper.class)
public interface MilitaryUnitRepository {
    @SqlQuery("SELECT * FROM military_units WHERE id = :id")
    Optional<MilitaryUnit> findById(@Bind("id") Long id);

    @SqlQuery("SELECT * FROM military_units")
    List<MilitaryUnit> findAll();

    @SqlUpdate("INSERT INTO military_units (name, type, parent_id, commander_id, location_id) VALUES (:name, :type, :parentId, :commanderId, :locationId)")
    void insert(@Bind("name") String name, @Bind("type") String type, @Bind("parentId") Long parentId, @Bind("commanderId") Long commanderId, @Bind("locationId") Long locationId);
}
