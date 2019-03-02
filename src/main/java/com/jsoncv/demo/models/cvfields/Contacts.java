package com.jsoncv.demo.models.cvfields;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Contacts {
    long phoneNumber;
    String email;
    String linkedIn;
    String gitHub;
}
