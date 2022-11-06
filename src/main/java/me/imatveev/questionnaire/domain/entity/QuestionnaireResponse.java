package me.imatveev.questionnaire.domain.entity;

import lombok.Builder;
import lombok.Value;

import java.util.Collection;

@Value
@Builder
public class QuestionnaireResponse {
    String id;
    String neighbourId;
    String questionnaireId;
    Collection<ClauseResponse> responses;
}
