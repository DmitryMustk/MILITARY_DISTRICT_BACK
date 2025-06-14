package com.example.military_district_back.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MilitaryUnitResponse(
   @NotNull Long id,
   @NotBlank String name,
   @NotBlank String type,
   Long parentId,
   Long commanderId,
   Long locationId
) {}