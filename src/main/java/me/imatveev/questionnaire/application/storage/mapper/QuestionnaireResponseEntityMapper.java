package me.imatveev.questionnaire.application.storage.mapper;

import me.imatveev.questionnaire.application.storage.entity.QuestionnaireResponseEntity;
import me.imatveev.questionnaire.application.storage.entity.QuestionnaireResponseSummaryAggregation;
import me.imatveev.questionnaire.application.storage.utils.IdUtils;
import me.imatveev.questionnaire.domain.entity.ClauseSummary;
import me.imatveev.questionnaire.domain.entity.QuestionnaireResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.Collection;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        imports = IdUtils.class
)
public interface QuestionnaireResponseEntityMapper {
    @Mapping(target = "id",
            expression = "java(response.getId() == null ? IdUtils.randomiseId() : response.getId())"
    )
    QuestionnaireResponseEntity convert(QuestionnaireResponse response);

    QuestionnaireResponse convert(QuestionnaireResponseEntity response);

    Collection<ClauseSummary> convert(Collection<QuestionnaireResponseSummaryAggregation> aggregations);
}
