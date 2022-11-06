package me.imatveev.questionnaire.application.web.mapper;

import me.imatveev.questionnaire.application.web.dto.ClauseDto;
import me.imatveev.questionnaire.application.web.dto.ClauseSummaryDto;
import me.imatveev.questionnaire.domain.entity.Clause;
import me.imatveev.questionnaire.domain.entity.ClauseSummary;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.Collection;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ClauseMapper {
    Clause convert(ClauseDto clauseDto);

    ClauseDto convert(Clause clause);

    ClauseSummaryDto convert(ClauseSummary summary);


}
