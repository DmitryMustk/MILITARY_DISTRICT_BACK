package com.example.military_district_back.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GeneralAttributes {
    private Long personnelId;
    private LocalDate academyGraduationDate;
    private LocalDate generalRankAssignmentDate;
}
