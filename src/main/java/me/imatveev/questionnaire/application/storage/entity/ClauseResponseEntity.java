package me.imatveev.questionnaire.application.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClauseResponseEntity {
    @NotNull
    private Integer number;
    @NotNull
    private Boolean result;
}
