package me.imatveev.questionnaire.application.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("responses")
public class QuestionnaireResponseEntity {
    @Id
    private String id;

    private String neighbourId;

    private String questionnaireId;

    private List<ClauseResponseEntity> responses;
}
