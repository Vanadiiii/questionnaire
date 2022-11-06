package me.imatveev.questionnaire.domain.entity;

import lombok.Builder;
import lombok.Value;

import java.util.Collection;

@Value
@Builder
public class Response {
    String id;
    Questionnaire questionnaire;
    Collection<Clause> clauses;
    Neighbour neighbour;
}
