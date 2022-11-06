package me.imatveev.questionnaire.application.web.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ClauseDto {
    @NotNull
    private Integer number;
    @NotEmpty
    private String value;
}
