package com.example.military_district_back.mapper;

import com.example.military_district_back.model.MilitaryUnit;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MilitaryUnitMapper implements RowMapper<MilitaryUnit> {
    @Override
    public MilitaryUnit map(ResultSet rs, StatementContext ctx) throws SQLException {
        return MilitaryUnit.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .type(rs.getString("type"))
                .parentId(rs.getObject("parent_id", Long.class))
                .commanderId(rs.getObject("commander_id", Long.class))
                .locationId(rs.getObject("location_id", Long.class))
                .build();
    }
}
