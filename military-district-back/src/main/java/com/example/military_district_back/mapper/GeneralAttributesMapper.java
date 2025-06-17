package com.example.military_district_back.mapper;

import com.example.military_district_back.model.GeneralAttributes;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class GeneralAttributesMapper implements RowMapper<GeneralAttributes> {
    @Override
    public GeneralAttributes map(ResultSet rs, StatementContext ctx) throws SQLException {
        return GeneralAttributes.builder()
                .personnelId(rs.getLong("personnelId"))
                .academyGraduationDate(rs.getObject("academy_graduation_date", LocalDate.class))
                .generalRankAssignmentDate(rs.getObject("general_rank_assignment_date", LocalDate.class))
                .build();
    }
}
