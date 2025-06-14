package com.example.military_district_back.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LocationResponse(
        @NotNull Long id,
        @NotBlank String name,
        Double latitude,
        Double longitude
) {}
