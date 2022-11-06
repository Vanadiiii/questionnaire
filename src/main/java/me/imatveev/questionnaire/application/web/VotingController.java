package me.imatveev.questionnaire.application.web;

import lombok.RequiredArgsConstructor;
import me.imatveev.questionnaire.application.web.dto.QuestionnaireResponseDto;
import me.imatveev.questionnaire.application.web.mapper.QuestionnaireResponseMapper;
import me.imatveev.questionnaire.domain.VotingFacade;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/voting")
public class VotingController {
    private final VotingFacade facade;
    private final QuestionnaireResponseMapper mapper;

    @PostMapping
    public void vote(@RequestBody QuestionnaireResponseDto responseDto) {
        facade.vote(
                mapper.convert(responseDto)
        );
    }
}
