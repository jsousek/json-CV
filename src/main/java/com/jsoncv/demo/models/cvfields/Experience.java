package com.jsoncv.demo.models.cvfields;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    long from;
    long to;
    String company;
    String role;
    String description;
}
