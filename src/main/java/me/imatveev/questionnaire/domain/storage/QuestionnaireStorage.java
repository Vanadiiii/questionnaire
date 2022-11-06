package me.imatveev.questionnaire.domain.storage;

import me.imatveev.questionnaire.domain.entity.Questionnaire;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface QuestionnaireStorage {
    Collection<Questionnaire> findAll();

    Questionnaire save(Questionnaire questionnaire);

    @Transactional
    void deleteById(String id);

    Questionnaire findById(String id);

    void deleteAll();
}
