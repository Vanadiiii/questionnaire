package me.imatveev.questionnaire.domain;

import lombok.RequiredArgsConstructor;
import me.imatveev.questionnaire.domain.entity.Questionnaire;
import me.imatveev.questionnaire.domain.storage.QuestionnaireStorage;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public final class QuestionnaireFacade {
    private final QuestionnaireStorage questionnaireStorage;

    public String save(Questionnaire questionnaire) {
        return questionnaireStorage.save(questionnaire)
                .getId();
    }

    public void update(Questionnaire questionnaire) {
        questionnaireStorage.save(questionnaire);
    }

    public Collection<Questionnaire> findAll() {
        return questionnaireStorage.findAll();
    }

    public void delete(String id) {
        questionnaireStorage.deleteById(id);
    }

    public Questionnaire find(String id) {
        return questionnaireStorage.findById(id);
    }

    public void delete() {
        questionnaireStorage.deleteAll();
    }
}
