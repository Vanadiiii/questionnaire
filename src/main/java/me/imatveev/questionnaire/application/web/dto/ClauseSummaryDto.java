package me.imatveev.questionnaire.application.web.dto;

import lombok.Data;

import java.util.Collection;

@Data
public class ClauseSummaryDto {
    private Integer number;
    private Collection<ClauseVariantSummaryDto> results;
    private Integer count;
}
