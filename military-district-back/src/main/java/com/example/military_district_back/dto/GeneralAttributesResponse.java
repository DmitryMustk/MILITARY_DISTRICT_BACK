package com.example.military_district_back.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record GeneralAttributesResponse (
        @NotNull Long personnelId,
        LocalDate academyGraduationDate,
        LocalDate generalRankAssignmentDate
) {}
