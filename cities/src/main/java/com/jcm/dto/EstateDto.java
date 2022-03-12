package com.jcm.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EstateDto {

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 2)
    private String acronym;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }
}
