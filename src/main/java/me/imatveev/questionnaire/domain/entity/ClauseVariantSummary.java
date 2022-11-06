package me.imatveev.questionnaire.domain.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClauseVariantSummary {
    Boolean result;
    Integer count;
}
