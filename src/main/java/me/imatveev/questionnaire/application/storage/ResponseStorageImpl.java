package me.imatveev.questionnaire.application.storage;

import lombok.RequiredArgsConstructor;
import me.imatveev.questionnaire.application.storage.entity.QuestionnaireResponseEntity;
import me.imatveev.questionnaire.application.storage.mapper.QuestionnaireResponseEntityMapper;
import me.imatveev.questionnaire.application.storage.repository.QuestionnaireResponseMongoRepository;
import me.imatveev.questionnaire.domain.entity.ClauseSummary;
import me.imatveev.questionnaire.domain.entity.QuestionnaireResponse;
import me.imatveev.questionnaire.domain.storage.ResponseStorage;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@RequiredArgsConstructor
public class ResponseStorageImpl implements ResponseStorage {
    private final QuestionnaireResponseMongoRepository repository;
    private final QuestionnaireResponseEntityMapper mapper;

    @Override
    public void save(QuestionnaireResponse response) {
        final QuestionnaireResponseEntity responseEntity = mapper.convert(response);

        repository.save(
                responseEntity
        );
    }

    @Override
    public Collection<ClauseSummary> findSummaryByQuestionnaireId(String questionnaireId) {
        return mapper.convert(
                repository.findSummaryById(questionnaireId)
        );
    }
}
