package me.imatveev.questionnaire.application.web.mapper;

import me.imatveev.questionnaire.application.web.dto.QuestionnaireDto;
import me.imatveev.questionnaire.domain.entity.Questionnaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        uses = ClauseMapper.class
)
public interface QuestionnaireMapper {
    @Mapping(target = "id", ignore = true)
    Questionnaire convert(QuestionnaireDto questionnaireDto);

    QuestionnaireDto convert(Questionnaire questionnaireDto);
}
