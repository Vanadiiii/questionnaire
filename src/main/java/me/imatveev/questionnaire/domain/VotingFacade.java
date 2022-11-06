package me.imatveev.questionnaire.domain;

import lombok.RequiredArgsConstructor;
import me.imatveev.questionnaire.domain.entity.ClauseSummary;
import me.imatveev.questionnaire.domain.entity.QuestionnaireResponse;
import me.imatveev.questionnaire.domain.storage.ResponseStorage;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public final class VotingFacade {
    private final ResponseStorage storage;

    public void vote(QuestionnaireResponse response) {
        storage.save(response);
    }

    public Collection<ClauseSummary> findByQuestionnaireId(String questionnaireId) {
        return storage.findSummaryByQuestionnaireId(questionnaireId);
    }
}
