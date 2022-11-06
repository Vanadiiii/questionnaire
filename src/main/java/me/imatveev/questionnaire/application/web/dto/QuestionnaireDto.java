package me.imatveev.questionnaire.application.web.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class QuestionnaireDto {
    String id;
    @NotNull
    private LocalDateTime endTime;
    @NotEmpty
    @Valid
    private List<ClauseDto> clauses;
}
