package me.imatveev.questionnaire.application.storage.mapper;

import me.imatveev.questionnaire.application.storage.entity.ClauseEntity;
import me.imatveev.questionnaire.domain.entity.Clause;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ClauseEntityMapper {
    ClauseEntity convert(Clause clause);

    Clause convert(ClauseEntity clause);
}
