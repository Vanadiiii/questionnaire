package me.imatveev.questionnaire.application.web.mapper;

import me.imatveev.questionnaire.application.web.dto.ClauseSummaryDto;
import me.imatveev.questionnaire.application.web.dto.QuestionnaireDto;
import me.imatveev.questionnaire.application.web.dto.QuestionnaireResponseDto;
import me.imatveev.questionnaire.domain.entity.ClauseSummary;
import me.imatveev.questionnaire.domain.entity.Questionnaire;
import me.imatveev.questionnaire.domain.entity.QuestionnaireResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.Collection;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        uses = ClauseMapper.class
)
public interface QuestionnaireResponseMapper {
    QuestionnaireResponse convert(QuestionnaireResponseDto responseDto);

    QuestionnaireDto convert(Questionnaire questionnaireDto);

    Collection<ClauseSummaryDto> convert(Collection<ClauseSummary> summary);
}
