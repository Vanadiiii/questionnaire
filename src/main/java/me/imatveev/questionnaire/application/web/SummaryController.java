package me.imatveev.questionnaire.application.web;

import lombok.RequiredArgsConstructor;
import me.imatveev.questionnaire.application.web.dto.ClauseSummaryDto;
import me.imatveev.questionnaire.application.web.mapper.QuestionnaireResponseMapper;
import me.imatveev.questionnaire.domain.VotingFacade;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/summaries")
public class SummaryController {
    private final VotingFacade facade;
    private final QuestionnaireResponseMapper mapper;

    @GetMapping //todo - add cache
    public Collection<ClauseSummaryDto> getSummaries(@RequestParam String questionnaireId) {
        return mapper.convert(
                facade.findByQuestionnaireId(questionnaireId)
        );
    }
}
