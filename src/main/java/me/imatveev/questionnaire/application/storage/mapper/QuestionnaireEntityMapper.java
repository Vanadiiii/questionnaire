package me.imatveev.questionnaire.application.storage.mapper;

import me.imatveev.questionnaire.application.storage.entity.QuestionnaireEntity;
import me.imatveev.questionnaire.application.storage.utils.IdUtils;
import me.imatveev.questionnaire.domain.entity.Questionnaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        imports = IdUtils.class,
        uses = ClauseEntityMapper.class
)
public interface QuestionnaireEntityMapper {
    @Mapping(target = "id",
            expression = "java(questionnaire.getId() == null ? IdUtils.randomiseId() : questionnaire.getId())"
    )
    QuestionnaireEntity convert(Questionnaire questionnaire);

    Questionnaire convert(QuestionnaireEntity questionnaire);
}
