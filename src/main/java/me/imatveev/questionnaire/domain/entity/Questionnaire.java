package me.imatveev.questionnaire.domain.entity;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.time.LocalDateTime;
import java.util.Collection;

@Value
@Builder
public class Questionnaire {
    @With
    String id;
    LocalDateTime endTime;
    Collection<Clause> clauses;

}
