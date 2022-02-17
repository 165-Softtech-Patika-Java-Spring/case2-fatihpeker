package com.example.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddNewNeigbourhoodRequestDto {

    @NotNull
    private String name;

    @NotNull
    private String district_id;

}
