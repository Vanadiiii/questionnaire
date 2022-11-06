package me.imatveev.questionnaire.application.web.dto;

import lombok.Data;
import me.imatveev.questionnaire.application.storage.entity.ClauseResponseEntity;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class QuestionnaireResponseDto {
    private String id;
    @NotNull
    private String neighbourId;
    @NotNull
    private String questionnaireId;
    @NotEmpty
    @Valid
    private List<ClauseResponseEntity> responses;
}
