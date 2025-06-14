package com.example.military_district_back.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Personnel {
    private Long id;
    private String name;
    private String rank;
    private String category;
}
