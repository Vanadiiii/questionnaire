package me.imatveev.questionnaire.application.web;

import lombok.RequiredArgsConstructor;
import me.imatveev.questionnaire.application.web.dto.QuestionnaireDto;
import me.imatveev.questionnaire.application.web.mapper.QuestionnaireMapper;
import me.imatveev.questionnaire.domain.QuestionnaireFacade;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collection;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/questionnaires")
public class QuestionnaireController {
    private final QuestionnaireMapper mapper;
    private final QuestionnaireFacade facade;

    @GetMapping
    public Collection<QuestionnaireDto> findAll() {
        return facade.findAll()
                .stream()
                .map(mapper::convert)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public QuestionnaireDto findById(@PathVariable String id) {
        return mapper.convert(
                facade.find(id)
        );
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody @Valid QuestionnaireDto questionnaire) {
        return facade.save(
                mapper.convert(questionnaire)
        );
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String id,
                       @RequestBody @Valid QuestionnaireDto questionnaire) {
        facade.save(
                mapper.convert(questionnaire)
                        .withId(id)
        );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        facade.delete(id);
    }

    @DeleteMapping
    public void deleteAll() {
        facade.delete();
    }
}
