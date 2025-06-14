package com.example.military_district_back.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PersonnelResponse (
  @NotNull Long id,
  @NotBlank String name,
  @NotBlank String rank,
  @NotBlank String category
) {}
