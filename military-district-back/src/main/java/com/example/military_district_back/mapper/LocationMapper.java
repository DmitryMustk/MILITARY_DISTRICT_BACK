package com.example.military_district_back.mapper;

import com.example.military_district_back.model.Location;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationMapper implements RowMapper<Location> {
    @Override
    public Location map(ResultSet rs, StatementContext ctx) throws SQLException {
        return Location.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .latitude(rs.getObject("latitude", Double.class))
                .longitude(rs.getObject("longitude", Double.class))
                .build();
    }
}
