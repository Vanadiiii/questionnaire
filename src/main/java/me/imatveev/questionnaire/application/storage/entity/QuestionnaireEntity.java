package me.imatveev.questionnaire.application.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("questionnaires")
public class QuestionnaireEntity {
    @Id
    private String id;
    private LocalDateTime endTime;
    private List<ClauseEntity> clauses;
}
