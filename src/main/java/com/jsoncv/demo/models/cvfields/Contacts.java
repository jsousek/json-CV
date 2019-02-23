package com.jsoncv.demo.models.cvfields;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder
@Setter
@Getter
@NoArgsConstructor
public class Contacts {
    long phoneNumber;
    String email;
    String linkedIn;
    String gitHub;
}
