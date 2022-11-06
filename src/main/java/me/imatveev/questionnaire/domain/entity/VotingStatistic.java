package me.imatveev.questionnaire.domain.entity;

import lombok.Builder;
import lombok.Value;

import java.util.Collection;

@Value
@Builder
public class VotingStatistic {
    String questionnaireId;

    Collection<ClauseSummary> clauses;
}
