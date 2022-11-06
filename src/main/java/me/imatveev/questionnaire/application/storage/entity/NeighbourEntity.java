package me.imatveev.questionnaire.application.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("neighbours")
public class NeighbourEntity {
    @Id
    private String id;
    private String name;
    private Integer apartmentNumber;
}
