package me.imatveev.questionnaire.domain.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClauseResponse {
    Integer number;
    Boolean result;
}
