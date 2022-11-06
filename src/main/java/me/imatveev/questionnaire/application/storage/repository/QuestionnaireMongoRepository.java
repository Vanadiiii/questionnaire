package me.imatveev.questionnaire.application.storage.repository;

import me.imatveev.questionnaire.application.storage.entity.QuestionnaireEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionnaireMongoRepository extends MongoRepository<QuestionnaireEntity, String> {

}
