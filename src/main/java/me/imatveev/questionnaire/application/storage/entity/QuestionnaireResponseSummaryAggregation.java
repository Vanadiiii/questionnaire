package me.imatveev.questionnaire.application.storage.entity;

import lombok.Data;

import java.util.Collection;

@Data
public class QuestionnaireResponseSummaryAggregation {
    private int number;
    private int count;
    private Collection<ClauseResponseSummaryAggregation> results;
}
