package me.imatveev.questionnaire.domain.entity;

import lombok.Builder;
import lombok.Value;

import java.util.Collection;

@Value
@Builder
public class ClauseSummary {
    Integer number;
    Collection<ClauseVariantSummary> results;
    Integer count;
}
