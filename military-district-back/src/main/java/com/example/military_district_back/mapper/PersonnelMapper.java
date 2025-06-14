package com.example.military_district_back.mapper;

import com.example.military_district_back.model.Personnel;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonnelMapper implements RowMapper<Personnel> {
    @Override
    public Personnel map(ResultSet rs, StatementContext ctx) throws SQLException {
        return Personnel.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .rank(rs.getString("rank"))
                .category(rs.getString("category"))
                .build();
    }
}
