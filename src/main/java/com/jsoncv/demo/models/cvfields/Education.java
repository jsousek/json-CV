package com.jsoncv.demo.models.cvfields;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    long from;
    long to;
    String school;
    String description;
}
