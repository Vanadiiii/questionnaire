package me.imatveev.questionnaire.domain.storage;

import me.imatveev.questionnaire.domain.entity.ClauseSummary;
import me.imatveev.questionnaire.domain.entity.QuestionnaireResponse;

import java.util.Collection;

public interface ResponseStorage {

    void save(QuestionnaireResponse response);

    Collection<ClauseSummary> findSummaryByQuestionnaireId(String questionnaireId);
}
