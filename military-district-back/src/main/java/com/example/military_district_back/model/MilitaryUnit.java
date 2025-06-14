package com.example.military_district_back.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MilitaryUnit {
    private Long id;
    private String name;
    private String type;
    private Long parentId;
    private Long commanderId;
    private Long locationId;
}
