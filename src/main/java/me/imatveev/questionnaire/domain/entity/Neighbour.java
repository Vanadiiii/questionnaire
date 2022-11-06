package me.imatveev.questionnaire.domain.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Neighbour {
    String id;
    String fullName;
    Byte entrance;
    Short apartmentNumber;
}
