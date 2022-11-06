package me.imatveev.questionnaire.application.storage;

import lombok.RequiredArgsConstructor;
import me.imatveev.questionnaire.application.storage.entity.QuestionnaireEntity;
import me.imatveev.questionnaire.application.storage.mapper.QuestionnaireEntityMapper;
import me.imatveev.questionnaire.application.storage.repository.QuestionnaireMongoRepository;
import me.imatveev.questionnaire.domain.entity.Questionnaire;
import me.imatveev.questionnaire.domain.storage.QuestionnaireStorage;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class QuestionnaireStorageImpl implements QuestionnaireStorage {
    private final QuestionnaireMongoRepository repository;
    private final QuestionnaireEntityMapper mapper;

    @Override
    public Collection<Questionnaire> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::convert)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public Questionnaire save(Questionnaire questionnaire) {
        final QuestionnaireEntity entity = mapper.convert(questionnaire);
        final String id = entity.getId();

        repository.save(entity);

        return questionnaire.withId(id);
    }

    @Transactional
    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public Questionnaire findById(String id) {
        return repository.findById(id)
                .map(mapper::convert)
                .orElseThrow(() -> new RuntimeException("Can't find questionnaire with id - " + id));
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
