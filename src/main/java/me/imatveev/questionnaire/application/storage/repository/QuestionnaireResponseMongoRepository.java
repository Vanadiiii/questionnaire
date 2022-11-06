package me.imatveev.questionnaire.application.storage.repository;

import me.imatveev.questionnaire.application.storage.entity.QuestionnaireResponseEntity;
import me.imatveev.questionnaire.application.storage.entity.QuestionnaireResponseSummaryAggregation;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface QuestionnaireResponseMongoRepository extends MongoRepository<QuestionnaireResponseEntity, String> {
    @Aggregation(pipeline = {
            "{ $match: { questionnaireId: '?0' } }",
            "{ $unwind: '$responses' }",
            "{ $project: { _id: 0, responses: 1 } }",
            "{ $group: { _id: { 'num': '$responses.number', 'value': '$responses.result' }, count: { $count: {} } } }",
            "{ $group: { _id: '$_id.num', results: { $addToSet: { result: '$_id.value', count: '$count' } }, count: { $sum: '$count' } } }",
            "{ $project: { _id: 0, 'number': '$_id', 'results': '$results', 'count': '$count'} }",
            "{ $sort: { number: 1 } }"
    })
    List<QuestionnaireResponseSummaryAggregation> findSummaryById(String questionnaireId);
}
