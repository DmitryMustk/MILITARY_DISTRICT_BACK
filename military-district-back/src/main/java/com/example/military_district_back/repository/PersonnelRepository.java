package com.example.military_district_back.repository;

import com.example.military_district_back.mapper.PersonnelMapper;
import com.example.military_district_back.model.Personnel;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.Optional;

@RegisterRowMapper(PersonnelMapper.class)
public interface PersonnelRepository {

    @SqlQuery("SELECT * FROM personnel WHERE id = :id")
    Optional<Personnel> findById(@Bind("id") Long id);

    @SqlQuery("SELECT * FROM personnel")
    List<Personnel> findAll();

    @SqlUpdate("INSERT INTO personnel (name, rank, category) VALUES (:name, :rank, :category)")
    void insert(@Bind("name") String name, @Bind("rank") String rank, @Bind("category") String category);
}